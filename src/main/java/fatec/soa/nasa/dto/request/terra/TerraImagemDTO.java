
package fatec.soa.nasa.dto.request.terra;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "urlImage",
    "dateTime",
    "coord"
})
@Generated("jsonschema2pojo")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TerraImagemDTO {

    @JsonProperty("urlImage")
    public String urlImage;
    @JsonProperty("dateTime")
    public String dateTime;
    @JsonProperty("coord")
    public Coord coord;

}
