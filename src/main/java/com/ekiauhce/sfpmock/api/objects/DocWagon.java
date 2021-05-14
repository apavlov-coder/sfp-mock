package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Random;

@Data
public class DocWagon {
    private static final String SKUNUMBER_FIELD = "SKUNumber";
    private static final String ROLLERBEARINGSMARK_FIELD = "RollerBearingsMark";
    private static final String CARGOWEIGHTTON_FIELD = "CargoWeightTon";
    private static final String DESTINATION_FIELD = "Destination";
    private static final String CARGOCODE_FIELD = "CargoCode";
    private static final String RECEIVER_FIELD = "Receiver";
    private static final String TRACKCODE_FIELD = "TrackCode";
    private static final String COVERINGCODE_FIELD = "CoveringCode";
    private static final String CROSSECTION_FIELD = "Crossection";
    private static final String SEALNUMBER_FIELD = "SealNumber";
    private static final String CONTAINERSNUMERATOR_FIELD = "ContainersNumerator";
    private static final String CONTAINERSDENOMINATOR_FIELD = "ContainersDenominator";
    private static final String TAREWEIGHTTON_FIELD = "TareWeightTon";
    private static final String NOTE_FIELD = "Note";
    private static final String BORDERSTATION_FIELD = "BorderStation";

    @JsonProperty(SKUNUMBER_FIELD)
    private String skunNumber;

    @JsonProperty(ROLLERBEARINGSMARK_FIELD)
    private Integer rollerBearingsMark;

    @JsonProperty(CARGOWEIGHTTON_FIELD)
    private Integer cargoWeightTon;

    @JsonProperty(DESTINATION_FIELD)
    private Integer destination;

    @JsonProperty(CARGOCODE_FIELD)
    private Integer cargoCode;

    @JsonProperty(RECEIVER_FIELD)
    private Integer receiever;

    @JsonProperty(TRACKCODE_FIELD)
    private Integer trackCode;

    @JsonProperty(COVERINGCODE_FIELD)
    private Integer coveringCode;

    @JsonProperty(CROSSECTION_FIELD)
    private Integer crossection;

    @JsonProperty(SEALNUMBER_FIELD)
    private Integer sealNumber;

    @JsonProperty(CONTAINERSNUMERATOR_FIELD)
    private Integer containersNumerator;

    @JsonProperty(CONTAINERSDENOMINATOR_FIELD)
    private Integer containersDenominator;

    @JsonProperty(TAREWEIGHTTON_FIELD)
    private Integer tareWeightTone;

    @JsonProperty(NOTE_FIELD)
    private String note;

    @JsonProperty(BORDERSTATION_FIELD)
    private Integer borderStation;

    public static DocWagon mock() {
        Random random = new Random();
        DocWagon docWagon = new DocWagon();

        docWagon.setSkunNumber(Integer.toString(random.nextInt(99999999)));
        docWagon.setRollerBearingsMark(random.nextInt(2));
        docWagon.setCargoWeightTon(80 + random.nextInt(100 - 80));
        docWagon.setDestination(random.nextInt(9999));
        docWagon.setCargoCode(random.nextInt(99999));
        docWagon.setReceiever(random.nextInt(9999));
        docWagon.setTrackCode(random.nextInt(10));
        docWagon.setCoveringCode(random.nextInt(10));
        docWagon.setCrossection(random.nextInt(10));
        docWagon.setSealNumber(random.nextInt(10));
        docWagon.setContainersNumerator(random.nextInt());
        docWagon.setContainersDenominator(random.nextInt());
        docWagon.setTareWeightTone(random.nextInt());
        docWagon.setNote(Integer.toString(random.nextInt()));
        docWagon.setBorderStation(random.nextInt(9999));

        return docWagon;
    }
}
