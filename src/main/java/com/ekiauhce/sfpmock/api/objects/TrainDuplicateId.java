
package com.ekiauhce.sfpmock.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "$numberLong"
})
public class TrainDuplicateId {

    @JsonProperty("$numberLong")
    public String $numberLong;

}
