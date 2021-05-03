
package com.ekiauhce.sfpmock.api.objects;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Setter;

@JsonPropertyOrder({
    "$numberLong"
})
@Setter
public class TrainDocumentId {

    @JsonProperty("$numberLong")
    public String numberLong;

    public static TrainDocumentId mock(long id) {
        TrainDocumentId trainDocumentId = new TrainDocumentId();
        trainDocumentId.setNumberLong(Long.toString(id));

        return trainDocumentId;
    }
}
