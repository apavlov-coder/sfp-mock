
package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "$numberLong"
})
public class TechnovisorReportId {

    @JsonProperty("$numberLong")
    public String numberLong;
}
