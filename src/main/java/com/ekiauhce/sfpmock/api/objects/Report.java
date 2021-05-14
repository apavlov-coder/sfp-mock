
package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Setter;

import java.util.Collections;
import java.util.List;
import java.util.Random;

@Setter
@JsonPropertyOrder({
        "_id",
        "RailOCRReportId",
        "ControlPoint",
        "Direction",
        "IsApproved",
        "IsAttentionRequired",
        "IsCommented",
        "LocomotivesCount",
        "StartedTime",
        "State",
        "Supervisor",
        "TechnovisorReportId",
        "TrainDocumentId",
        "TrainDuplicateId",
        "TrainIndex",
        "TrainNumber",
        "TrainType",
        "VirtualWagons",
        "Wagons",
        "WagonsCount"
})
public class Report {

    @JsonProperty("_id")
    public Id id;

    @JsonProperty("RailOCRReportId")
    public RailOCRReportId railOCRReportId;

    @JsonProperty("ControlPoint")
    public ControlPoint controlPoint;

    @JsonProperty("Direction")
    public Integer direction;

    @JsonProperty("IsApproved")
    public Boolean isApproved;

    @JsonProperty("IsAttentionRequired")
    public Boolean isAttentionRequired;

    @JsonProperty("IsCommented")
    public Boolean isCommented;

    @JsonProperty("LocomotivesCount")
    public Integer locomotivesCount;

    @JsonProperty("StartedTime")
    public DateSender startedTime;

    @JsonProperty("State")
    public Integer state;

    @JsonProperty("Supervisor")
    public Object supervisor;

    @JsonProperty("TechnovisorReportId")
    public TechnovisorReportId technovisorReportId;

    @JsonProperty("TrainDocumentId")
    public Id trainDocumentId;

    @JsonProperty("TrainDuplicateId")
    public TrainDuplicateId trainDuplicateId;

    @JsonProperty("TrainIndex")
    public Object trainIndex;

    @JsonProperty("TrainNumber")
    public Integer trainNumber;

    @JsonProperty("TrainType")
    public Integer trainType;

    @JsonProperty("VirtualWagons")
    public List<Object> virtualWagons = null;

    @JsonProperty("Wagons")
    public List<ReportWagon> reportWagons = null;

    @JsonProperty("WagonsCount")
    public Integer wagonsCount;

    public static Report mock(Random random, Id docId, Id trainReportId, int trainNumber, List<Wagon> wagons) {
        Report report = new Report();

        report.setId(trainReportId);
        report.setRailOCRReportId(RailOCRReportId.mock());
        report.setControlPoint(ControlPoint.mock());
        report.setDirection(1);
        report.setIsApproved(random.nextBoolean());
        report.setIsAttentionRequired(random.nextBoolean());
        report.setIsCommented(random.nextBoolean());
        report.setLocomotivesCount(1 + random.nextInt(2 - 1)); // [1; 2]
        report.setStartedTime(DateSender.mock());
        report.setState(2);
        report.setSupervisor(null);
        report.setTechnovisorReportId(null);
        report.setTrainDocumentId(docId); // matches to doc's
        report.setTrainDuplicateId(null);
        report.setTrainNumber(trainNumber); // matches to doc's
        report.setTrainType(null);
        report.setVirtualWagons(Collections.emptyList());

//        List<ReportWagon> reportWagons = ... // TODO:
//
//        report.setReportWagons();
        report.setWagonsCount(wagons.size());

        return report;
    }
}
