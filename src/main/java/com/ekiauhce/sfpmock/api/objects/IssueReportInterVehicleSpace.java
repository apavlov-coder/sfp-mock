package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IssueReportInterVehicleSpace extends TemporalIssueReport {
    @JsonProperty(value = "TypeOfDefect")
    private int typeOfDefect;
    @JsonProperty(value = "Side")
    private int side;
    @JsonProperty(value = "CounterMm")
    private int counterMm;

    public int getTypeOfDefect() {
        return typeOfDefect;
    }

    public void setTypeOfDefect(int typeOfDefect) {
        this.typeOfDefect = typeOfDefect;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getCounterMm() {
        return counterMm;
    }

    public void setCounterMm(int counterMm) {
        this.counterMm = counterMm;
    }
}
