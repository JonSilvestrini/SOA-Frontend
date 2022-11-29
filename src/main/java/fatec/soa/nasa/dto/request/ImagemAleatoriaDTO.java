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
public class ImagemAleatoriaDTO {
    @JsonProperty("titulo")
    private String titulo;

    @JsonProperty("explicacao")
    private String explicacao;

    @JsonProperty("data")
    private String data;

    @JsonProperty("urlImagem")
    private String urlImagem;

}
