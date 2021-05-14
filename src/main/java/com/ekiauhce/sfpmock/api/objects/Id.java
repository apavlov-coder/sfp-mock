package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

import java.util.Random;

@Setter
public class Id {
    private static final String NUMBERLONG_FIELD = "$numberLong";

    @JsonProperty(NUMBERLONG_FIELD)
    private String numberLong;

    public static Id mock(Random random) {
        Id id = new Id();
        id.setNumberLong(String.valueOf(random.nextInt(9999)));
        return id;
    }
}
