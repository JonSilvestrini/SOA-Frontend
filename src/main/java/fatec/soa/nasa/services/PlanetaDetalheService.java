package fatec.soa.nasa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import fatec.soa.nasa.dto.request.PlanetaDetalheDTO;
import fatec.soa.nasa.external.WebClientEngine;

@Service
public class PlanetaDetalheService {
    
    @Autowired
	private WebClientEngine<PlanetaDetalheDTO> webClient;

    public PlanetaDetalheDTO getPlanetaDetalhe(String name) {
		return webClient.callUrlSync("http://168.138.133.60:9090/planetas/detalhe/" + name,
    			new ParameterizedTypeReference<PlanetaDetalheDTO>() {});
	}

    

}
