package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;


@Setter
public class DateSender {
    private static final String DATETIME_FIELD = "DateTime";
    private static final String TICKS_FIELD = "Ticks";

    @JsonProperty(DATETIME_FIELD)
    private DateTime dateTime;

    @JsonProperty(TICKS_FIELD)
    private Ticks ticks;

    public static DateSender mock() {
//        LocalDateTime now = LocalDateTime.now();
        Date nowDate = new Date();
        DateTime dateTime = new DateTime();

        DateSender dateSender = new DateSender();

        Timestamp now = new Timestamp(nowDate.getTime());
        dateTime.setDate(now);

        Ticks ticks = new Ticks();
        ticks.setNumberLong(now.getTime());

        dateSender.setDateTime(dateTime);
        dateSender.setTicks(ticks);

        return dateSender;
    }
}
