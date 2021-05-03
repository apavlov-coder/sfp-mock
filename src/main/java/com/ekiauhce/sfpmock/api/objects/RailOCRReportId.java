
package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Setter;

@Setter
@JsonPropertyOrder({
    "$binary",
    "$type"
})
public class RailOCRReportId {

    @JsonProperty("$binary")
    public String binary;

    @JsonProperty("$type")
    public String type;

    public static RailOCRReportId mock() {
        RailOCRReportId railOCRReportId = new RailOCRReportId();
        railOCRReportId.setBinary(" ");
        railOCRReportId.setType(" ");
        return railOCRReportId;
    }
}
