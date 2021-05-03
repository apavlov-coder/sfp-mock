package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Data
public class Timestamp {
    private static final String DATETIME_FIELD = "DateTime";
    private static final String TICKS_FIELD = "Ticks";

    @JsonProperty(DATETIME_FIELD)
    private DateTime dateTime;

    @JsonProperty(TICKS_FIELD)
    private Ticks ticks;

    public static Timestamp mock() {
        LocalDateTime now = LocalDateTime.now();

        Timestamp timestamp = new Timestamp();

        DateTime dateTime = new DateTime();
        dateTime.setDate(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        Ticks ticks = new Ticks();
        ticks.setNumberLong(Long.toString(now.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));

        timestamp.setDateTime(dateTime);
        timestamp.setTicks(ticks);

        return timestamp;
    }
}
