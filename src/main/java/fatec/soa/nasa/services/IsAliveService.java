package fatec.soa.nasa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import fatec.soa.nasa.dto.request.IsAliveDTO;
import fatec.soa.nasa.external.WebClientEngine;

@Service
public class IsAliveService {

	@Autowired
	private WebClientEngine<IsAliveDTO> webClient;

	public IsAliveDTO getIsAlive() {
		return webClient.callUrlSync("http://168.138.133.60:9090/isalive",
    			new ParameterizedTypeReference<IsAliveDTO>() {});
	}

}
