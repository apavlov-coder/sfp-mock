package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maria on 08.05.2018.
 */
public class ListDeserializer {
    public static <T> List<T> deserializeList(final JsonParser jsonParser, JsonNode listOrObjectNode, Class cls) throws IOException, JsonProcessingException {
        final ObjectCodec objectCodec = jsonParser.getCodec();
        final List<T> result = new ArrayList<T>();
        if (listOrObjectNode.isArray()) {
            for (JsonNode node : listOrObjectNode) {
                result.add((T) objectCodec.treeToValue(node, cls));
            }
        }
        return result;
    }
}
