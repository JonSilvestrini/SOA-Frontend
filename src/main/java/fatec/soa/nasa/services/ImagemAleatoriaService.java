package fatec.soa.nasa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import fatec.soa.nasa.dto.request.ImagemAleatoriaDTO;
import fatec.soa.nasa.external.WebClientEngine;

@Service
public class ImagemAleatoriaService {
    
    @Autowired
	private WebClientEngine<ImagemAleatoriaDTO> webClient;

    public ImagemAleatoriaDTO getImagemAleatatoria() {
		return webClient.callUrlSync("http://168.138.133.60:9090/nasa/imagem",
    			new ParameterizedTypeReference<ImagemAleatoriaDTO>() {});
	}

}
