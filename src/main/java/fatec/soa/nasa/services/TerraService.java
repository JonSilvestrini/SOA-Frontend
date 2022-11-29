package fatec.soa.nasa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import fatec.soa.nasa.dto.request.terra.TerraImagemDTO;
import fatec.soa.nasa.external.WebClientEngine;

@Service
public class TerraService {

	@Autowired
	private WebClientEngine<TerraImagemDTO> webClient;

	public TerraImagemDTO getPlanetaVisivel(String date) {
		return webClient.callUrlSync("http://168.138.133.60:9090/terra/" + date,
    			new ParameterizedTypeReference<TerraImagemDTO>() {});
	}

}
