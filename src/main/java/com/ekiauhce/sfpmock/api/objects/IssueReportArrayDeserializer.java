package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IssueReportArrayDeserializer extends JsonDeserializer<List<IssueReport>> {
    @Override
    public List<IssueReport> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode root = jsonParser.getCodec().readTree(jsonParser);
        ObjectMapper mapper = (ObjectMapper) jsonParser.getCodec();
        List<IssueReport> issueReportList = new ArrayList<>();
        if (root.isArray()) {
            for (final JsonNode node : root) {
                if (node.get("_t") == null) continue;

                List<String> t = ListDeserializer.<String>deserializeList(jsonParser, node.get("_t"), String.class);
                if (t.isEmpty()) continue;

                IssueReport issueReport = null;

                if (t.contains("IssueReportAxlePattern")) {
                    issueReport = mapper.treeToValue(node, IssueReportAxlePattern.class);
                    issueReportList.add(issueReport);
                }

                if (t.contains("IssueReportWeightImpactLoad")) {
                    issueReport = mapper.treeToValue(node, IssueReportWeightImpactLoad.class);
                    issueReportList.add(issueReport);
                }

                if (t.contains("IssueReportAxleWeightCarrying")) {
                    issueReport = mapper.treeToValue(node, IssueReportAxleWeightCarrying.class);
                    issueReportList.add(issueReport);
                }

                if (t.contains("IssueReportWeightCarrying")) {
                    issueReport = mapper.treeToValue(node, IssueReportWeightCarrying.class);
                    issueReportList.add(issueReport);
                }

                if (t.contains("TemporalIssueReport")) {
                    if (t.contains("IssueReportInterVehicleSpace")) {
                        issueReport = mapper.treeToValue(node, IssueReportInterVehicleSpace.class);
                        issueReportList.add(issueReport);
                    }

                    if (t.contains("IssueReportBodyAnomaly")) {
                        issueReport = mapper.treeToValue(node, IssueReportBodyAnomaly.class);
                        issueReportList.add(issueReport);
                    }
                }
            }
        }

        return issueReportList;
    }
}
