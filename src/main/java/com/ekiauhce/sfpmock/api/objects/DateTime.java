package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
public class DateTime {
    private static final String DATE_FIELD = "$date";

    @JsonProperty(DATE_FIELD)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+03:00")
    private Timestamp date;

}
