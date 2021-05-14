package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TemporalIssueReport extends IssueReport {
    @JsonProperty(value = "OccurrenceTime")
    private DateSender occurrenceTime;


    public DateSender getOccurrenceTime() {
        return occurrenceTime;
    }

    public void setOccurrenceTime(DateSender occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
    }
}
