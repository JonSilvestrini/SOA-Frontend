package fatec.soa.nasa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import fatec.soa.nasa.dto.request.planetas.PlanetaVisivelResponseDTO;
import fatec.soa.nasa.external.WebClientEngine;

@Service
public class PlanetaVisiveisService {

	@Autowired
	private WebClientEngine<PlanetaVisivelResponseDTO> webClient;

	public PlanetaVisivelResponseDTO getPlanetaVisivel() {
		return webClient.callUrlSync("http://168.138.133.60:9090/planetas/visiveis",
    			new ParameterizedTypeReference<PlanetaVisivelResponseDTO>() {});
	}

}
