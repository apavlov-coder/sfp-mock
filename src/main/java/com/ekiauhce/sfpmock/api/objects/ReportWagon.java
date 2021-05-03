
package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Setter;

import java.util.List;
import java.util.Random;

@JsonPropertyOrder({
    "AxlesCount",
    "CargoName",
    "Commentary",
    "DerailmentProbability",
    "DiagnosticCategory",
    "DistinctIndex",
    "FirstAxle",
    "InfrastructureInfluence",
    "IsManualyCorrected",
    "Issues",
    "LastAxle",
    "LoadState",
    "MileageKm",
    "MileageToServiceKm",
    "SKUNumber",
    "Speed",
    "TypeNumber",
    "WagonIndex",
    "WagonOrientation",
    "WagonType",
    "OKPO",
    "Owner"
})
@Setter
public class ReportWagon {

    @JsonProperty("AxlesCount")
    public Integer axlesCount;
    @JsonProperty("CargoName")
    public Object cargoName;
    @JsonProperty("Commentary")
    public Object commentary;
    @JsonProperty("DerailmentProbability")
    public Integer derailmentProbability;
    @JsonProperty("DiagnosticCategory")
    public Integer diagnosticCategory;
    @JsonProperty("DistinctIndex")
    public Integer distinctIndex;
    @JsonProperty("FirstAxle")
    public FirstAxle firstAxle;
    @JsonProperty("InfrastructureInfluence")
    public Integer infrastructureInfluence;
    @JsonProperty("IsManualyCorrected")
    public Boolean isManualyCorrected;
    @JsonProperty("Issues")
    public List<Issue> issues = null;
    @JsonProperty("LastAxle")
    public LastAxle lastAxle;
    @JsonProperty("LoadState")
    public Integer loadState;
    @JsonProperty("MileageKm")
    public Integer mileageKm;
    @JsonProperty("MileageToServiceKm")
    public Integer mileageToServiceKm;
    @JsonProperty("SKUNumber")
    public Object sKUNumber;
    @JsonProperty("Speed")
    public Double speed;
    @JsonProperty("TypeNumber")
    public Integer typeNumber;
    @JsonProperty("WagonIndex")
    public Integer wagonIndex;
    @JsonProperty("WagonOrientation")
    public Integer wagonOrientation;
    @JsonProperty("WagonType")
    public Integer wagonType;
    @JsonProperty("OKPO")
    public Object okpo;
    @JsonProperty("Owner")
    public Object owner;

    public static ReportWagon mock() {
        Random random = new Random();

        ReportWagon reportWagon = new ReportWagon();

        reportWagon.setAxlesCount(); //
        reportWagon.setCargoName(); //
        reportWagon.setCommentary(); //
        reportWagon.setDerailmentProbability(); //
        reportWagon.setDiagnosticCategory(); //
        reportWagon.setDistinctIndex(); //
        reportWagon.setFirstAxle(); //
        reportWagon.setInfrastructureInfluence(); //
        reportWagon.setIsManualyCorrected(); //

        List<Issue> issues = ... // TODO:

        reportWagon.setIssues(issues);
    }
}
