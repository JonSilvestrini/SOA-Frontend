package fatec.soa.nasa.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDTO{
	@JsonProperty("code")
	private Integer code;

	@JsonProperty("msg")
	private String msg;

	@JsonProperty("exceptionMsg")
	private String exceptionMsg;

}
