package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Setter;

@Setter
public class DateTime {
    private static final String DATE_FIELD = "$date";

    @JsonProperty(DATE_FIELD)
    private String date;

}
