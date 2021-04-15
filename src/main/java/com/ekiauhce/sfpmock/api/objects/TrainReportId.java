package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

import java.util.Random;

@Setter
public class TrainReportId {
    private static final String NUMBERLONG_FIELD = "$numberLong";

    @JsonProperty(NUMBERLONG_FIELD)
    private String numberLong;

    public static TrainReportId mock() {
        Random random = new Random();
        TrainReportId trainReportId = new TrainReportId();
        trainReportId.setNumberLong(Long.toString(random.nextLong()));

        return  trainReportId;
    }
}
