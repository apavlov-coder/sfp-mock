package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter
public class Doc {
    private static final String ID_FIELD = "_id";
    private static final String TRANSIMSSIONSTATION_FIELD = "TransmisionStation";
    private static final String TRAINNUMBER_FIELD = "TrainNumber";
    private static final String TRAINORIGINSTATIONCODE_FIELD = "TrainOriginStationCode";
    private static final String TRAINSEQUENTIALNUMBER_FIELD = "TrainSequentialNumber";
    private static final String TRAINDESTINATIONSTATIONCODE_FIELD = "TrainDestinationStationCode";
    private static final String ISENUMERATEDFROMHEAD_FIELD = "IsEnumeratedFromHead";
    private static final String TIMESTAMP_FIELD = "Timestamp";
    private static final String TRAINLENGTH_FIELD = "TrainLength";
    private static final String TRAINWEIGHTBRUTTO_FIELD = "TrainWeightBrutto";
    private static final String COVERINGCODE_FIELD = "CoveringCode";
    private static final String INDEXH1_FIELD = "IndexH1";
    private static final String INDEXH2_FIELD = "IndexH2";
    private static final String INDEXH3_FIELD = "IndexH3";
    private static final String INDEXH4_FIELD = "IndexH4";
    private static final String ISLIVELY_FIELD = "IsLively";
    private static final String TRACKMARK_FIELD = "TrackMark";
    private static final String WAGONS_FIELD = "Wagons";
    private static final String TRAINREPORTID_FIELD = "TrainReportId";

    private static List<Integer> formerStationList = Arrays.asList(6169, 6110);
    private static List<Integer> destinationStationList = Arrays.asList(6573, 8000);

    @JsonProperty(ID_FIELD)
    private Id id;

    @JsonProperty(TRANSIMSSIONSTATION_FIELD)
    private Integer transmisionStation;

    @JsonProperty(TRAINNUMBER_FIELD)
    private Integer trainNumber;

    @JsonProperty(TRAINORIGINSTATIONCODE_FIELD)
    private Integer trainOriginStationCode;

    @JsonProperty(TRAINSEQUENTIALNUMBER_FIELD)
    private Integer trainSequentialNumber;

    @JsonProperty(TRAINDESTINATIONSTATIONCODE_FIELD)
    private Integer trainDestinationStationCode;

    @JsonProperty(ISENUMERATEDFROMHEAD_FIELD)
    private Boolean isEnumeratedFromHead;

    @JsonProperty(TIMESTAMP_FIELD)
    private DateSender dateSender;

    @JsonProperty(TRAINLENGTH_FIELD)
    private Integer trainLength;

    @JsonProperty(TRAINWEIGHTBRUTTO_FIELD)
    private Integer trainWeightBrutto;

    @JsonProperty(COVERINGCODE_FIELD)
    private Integer coveringCode;

    @JsonProperty(INDEXH1_FIELD)
    private Integer indexH1;

    @JsonProperty(INDEXH2_FIELD)
    private Integer indexH2;

    @JsonProperty(INDEXH3_FIELD)
    private Integer indexH3;

    @JsonProperty(INDEXH4_FIELD)
    private Integer indexH4;

    @JsonProperty(ISLIVELY_FIELD)
    private Boolean isLively;

    @JsonProperty(TRACKMARK_FIELD)
    private Integer trackMark;

    @JsonProperty(WAGONS_FIELD)
    private List<Wagon> wagons;

    @JsonProperty(TRAINREPORTID_FIELD)
    private TrainReportId trainReportId;

    public static Doc mock(Random random) {

        Doc doc = new Doc();

        doc.setId(Id.mock(random));
        doc.setTransmisionStation(random.nextInt(9999));
        doc.setTrainNumber(2000 + random.nextInt(4000 - 2000));
        doc.setTrainOriginStationCode(formerStationList.get(random.nextInt(9999) % formerStationList.size()));
        doc.setTrainSequentialNumber(random.nextInt(999));
        doc.setTrainDestinationStationCode(destinationStationList.get(random.nextInt(9999) % destinationStationList.size()));
        doc.setIsEnumeratedFromHead(random.nextBoolean());
        doc.setDateSender(DateSender.mock());
        doc.setTrainWeightBrutto(2000 + random.nextInt(6000 - 2000));
        doc.setCoveringCode(random.nextInt(2));
        doc.setIndexH1(0);
        doc.setIndexH2(0);
        doc.setIndexH3(0);
        doc.setIndexH3(0);
        doc.setIndexH4(0);
        doc.setIsLively(random.nextBoolean());
        doc.setTrackMark(random.nextInt(2));

        List<Wagon> wagons = Stream
                .generate(Wagon::mock)
                .limit(57 + random.nextInt(40))
                .collect(Collectors.toList());

        doc.setWagons(wagons);
        doc.setTrainLength(wagons.size());
        doc.setTrainReportId(TrainReportId.mock(random));
        return doc;
    }
}
