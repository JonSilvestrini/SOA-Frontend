package fatec.soa.nasa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import fatec.soa.nasa.dto.request.terra.TerraImagemDTO;
import fatec.soa.nasa.external.WebClientEngine;

@Service
public class TerraService {

	@Autowired
	private WebClientEngine<List<TerraImagemDTO>> webClient;

	public List<TerraImagemDTO> getPlanetaVisivel(String date) {
		return webClient.callUrlSync("http://168.138.133.60:9090/terra/" + date,
    			new ParameterizedTypeReference<List<TerraImagemDTO>>() {});
	}

}
