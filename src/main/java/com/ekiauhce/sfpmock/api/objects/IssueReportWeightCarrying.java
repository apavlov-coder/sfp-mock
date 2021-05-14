package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IssueReportWeightCarrying extends IssueReport {
    @JsonProperty(value = "MaxCapacityKg")
    private int maxCapacityKg;
    @JsonProperty(value = "FactBruttoWeightKg")
    private int factBruttoWeightKg;
    @JsonProperty(value = "DeclBruttoWeightKg")
    private int declBruttoWeightKg;
    @JsonProperty(value = "DeclNettoWeightKg")
    private int declNettoWeightKg;
    @JsonProperty(value = "DeclTareWeightKg")
    private int declTareWeightKg;
    @JsonProperty(value = "FactBruttoWeightKgIGT")
    private int factBruttoWeightKgIGT;

    public int getMaxCapacityKg() {
        return maxCapacityKg;
    }

    public void setMaxCapacityKg(int maxCapacityKg) {
        this.maxCapacityKg = maxCapacityKg;
    }

    public int getFactBruttoWeightKg() {
        return factBruttoWeightKg;
    }

    public void setFactBruttoWeightKg(int factBruttoWeightKg) {
        this.factBruttoWeightKg = factBruttoWeightKg;
    }

    public int getDeclBruttoWeightKg() {
        return declBruttoWeightKg;
    }

    public void setDeclBruttoWeightKg(int declBruttoWeightKg) {
        this.declBruttoWeightKg = declBruttoWeightKg;
    }

    public int getDeclNettoWeightKg() {
        return declNettoWeightKg;
    }

    public void setDeclNettoWeightKg(int declNettoWeightKg) {
        this.declNettoWeightKg = declNettoWeightKg;
    }

    public int getDeclTareWeightKg() {
        return declTareWeightKg;
    }

    public void setDeclTareWeightKg(int declTareWeightKg) {
        this.declTareWeightKg = declTareWeightKg;
    }

    public int getFactBruttoWeightKgIGT() {
        return factBruttoWeightKgIGT;
    }

    public void setFactBruttoWeightKgIGT(int factBruttoWeightKgIGT) {
        this.factBruttoWeightKgIGT = factBruttoWeightKgIGT;
    }
}
