package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IssueReportAxleWeightCarrying extends IssueReport {
    @JsonProperty(value = "AxleAtWagon")
    private int axleAtWagon;
    @JsonProperty(value = "LeftSideLoad")
    private int leftSideLoad;
    @JsonProperty(value = "RightSideLoad")
    private int rightSideLoad;

    public int getAxleAtWagon() {
        return axleAtWagon;
    }

    public void setAxleAtWagon(int axleAtWagon) {
        this.axleAtWagon = axleAtWagon;
    }

    public int getLeftSideLoad() {
        return leftSideLoad;
    }

    public void setLeftSideLoad(int leftSideLoad) {
        this.leftSideLoad = leftSideLoad;
    }

    public int getRightSideLoad() {
        return rightSideLoad;
    }

    public void setRightSideLoad(int rightSideLoad) {
        this.rightSideLoad = rightSideLoad;
    }
}
