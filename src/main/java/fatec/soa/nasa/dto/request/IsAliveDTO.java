package fatec.soa.nasa.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IsAliveDTO{
	@JsonProperty("isAlive")
	private boolean isAlive;

	@JsonProperty("msg")
	private String msg;

}
