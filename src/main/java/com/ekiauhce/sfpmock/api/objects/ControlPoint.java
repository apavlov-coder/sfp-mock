
package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Setter
@JsonPropertyOrder({
        "_t",
        "ControlPointNumber",
        "Name",
        "Directions"
})
public class ControlPoint {

    @JsonProperty("_t")
    public String t;

    @JsonProperty("ControlPointNumber")
    public Integer controlPointNumber;

    @JsonProperty("Name")
    public String name;

    @JsonProperty("Directions")
    public List<String> directions;

    public static ControlPoint mock() {
        ControlPoint controlPoint = new ControlPoint();
        controlPoint.setT("ControlPoint");
        controlPoint.setControlPointNumber(2);
        controlPoint.setName("Еманжелинск");
        controlPoint.setDirections(Arrays.asList("18_КМ", "ЧЕЛ-ЮЖНЫЙ", "СИНЕГЛАЗОВО"));
        return controlPoint;
    }
}
