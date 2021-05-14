package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

@Setter
public class Ticks {
    private static final String NUMBERLONG_FIELD = "$numberLong";

    @JsonProperty(NUMBERLONG_FIELD)
    private Long numberLong;
}
