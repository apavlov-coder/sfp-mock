package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IssueReport {
    @JsonProperty(value = "_t")
    private IssueReportType[] t;

    @JsonProperty(value = "AlarmLevel")
    private int alarmLevel;
    @JsonProperty(value = "Category")
    private int category;

    public IssueReportType[] getT() {
        return t;
    }

    public void setT(IssueReportType[] t) {
        this.t = t;
    }

    public int getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(int alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
