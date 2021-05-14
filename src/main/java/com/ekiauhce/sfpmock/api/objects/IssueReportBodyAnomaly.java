package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IssueReportBodyAnomaly extends TemporalIssueReport {
    @JsonProperty(value = "AnomalyCategory")
    private int anomalyCategory;
    @JsonProperty(value = "DefectSize")
    private int defectSize;
    @JsonProperty(value = "Side")
    private int side;
    @JsonProperty(value = "Debug")
    private String debug;

    public int getAnomalyCategory() {
        return anomalyCategory;
    }

    public void setAnomalyCategory(int anomalyCategory) {
        this.anomalyCategory = anomalyCategory;
    }

    public int getDefectSize() {
        return defectSize;
    }

    public void setDefectSize(int defectSize) {
        this.defectSize = defectSize;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }
}
