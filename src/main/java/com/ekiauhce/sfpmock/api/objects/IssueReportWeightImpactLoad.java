package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IssueReportWeightImpactLoad extends IssueReport {
    @JsonProperty(value = "AxleAtWagon")
    private int axleAtWagon;
    @JsonProperty(value = "AxleAtTrain")
    private int axleAtTrain;
    @JsonProperty(value = "WheelNumber")
    private int wheelNumber;
    @JsonProperty(value = "SideIssue")
    private int sideIssue;
    @JsonProperty(value = "ImapactValueNwtn")
    private int imapactValueNwtn;
    @JsonProperty(value = "NormImapactValueNwtn")
    private int normImapactValueNwtn;
    @JsonProperty(value = "Severity")
    private double severity;
    @JsonProperty(value = "AlarmWSD")
    private int alarmWSD;
    @JsonProperty(value = "AlarmIL")
    private int alarmIL;

    public int getAxleAtWagon() {
        return axleAtWagon;
    }

    public void setAxleAtWagon(int axleAtWagon) {
        this.axleAtWagon = axleAtWagon;
    }

    public int getAxleAtTrain() {
        return axleAtTrain;
    }

    public void setAxleAtTrain(int axleAtTrain) {
        this.axleAtTrain = axleAtTrain;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public int getSideIssue() {
        return sideIssue;
    }

    public void setSideIssue(int sideIssue) {
        this.sideIssue = sideIssue;
    }

    public int getImapactValueNwtn() {
        return imapactValueNwtn;
    }

    public void setImapactValueNwtn(int imapactValueNwtn) {
        this.imapactValueNwtn = imapactValueNwtn;
    }

    public int getNormImapactValueNwtn() {
        return normImapactValueNwtn;
    }

    public void setNormImapactValueNwtn(int normImapactValueNwtn) {
        this.normImapactValueNwtn = normImapactValueNwtn;
    }

    public double getSeverity() {
        return severity;
    }

    public void setSeverity(double severity) {
        this.severity = severity;
    }

    public int getAlarmWSD() {
        return alarmWSD;
    }

    public void setAlarmWSD(int alarmWSD) {
        this.alarmWSD = alarmWSD;
    }

    public int getAlarmIL() {
        return alarmIL;
    }

    public void setAlarmIL(int alarmIL) {
        this.alarmIL = alarmIL;
    }
}
