package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IssueReportAxlePattern extends IssueReport {
    @JsonProperty(value = "AxleIndexAtWagon")
    private int axleIndexAtWagon;
    @JsonProperty(value = "NextAxleMm")
    private int nextAxleMm;

    public int getAxleIndexAtWagon() {
        return axleIndexAtWagon;
    }

    public void setAxleIndexAtWagon(int axleIndexAtWagon) {
        this.axleIndexAtWagon = axleIndexAtWagon;
    }

    public int getNextAxleMm() {
        return nextAxleMm;
    }

    public void setNextAxleMm(int nextAxleMm) {
        this.nextAxleMm = nextAxleMm;
    }
}
