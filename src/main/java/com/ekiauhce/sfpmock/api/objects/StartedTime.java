
package com.ekiauhce.sfpmock.api.objects;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Setter;

@JsonPropertyOrder({
    "DateTime",
    "Ticks"
})
@Setter
public class StartedTime {

    @JsonProperty("DateTime")
    public DateTime dateTime;

    @JsonProperty("Ticks")
    public Ticks ticks;

    public static StartedTime mock() {
        Timestamp timestamp = Timestamp.mock();
        StartedTime startedTime = new StartedTime();

        startedTime.setDateTime(timestamp.getDateTime());
        startedTime.setTicks(timestamp.getTicks());

        return startedTime;
    }
}
