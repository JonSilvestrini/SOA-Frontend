package fatec.soa.nasa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fatec.soa.nasa.dto.request.planetas.PlanetaVisivelResponseDTO;
import fatec.soa.nasa.services.PlanetaVisiveisService;

@RequestMapping("/paginas")
@Controller
public class PlanetaVisiveisController {

	@Autowired
	private PlanetaVisiveisService planetaVisiveisService;

    @GetMapping("/planetas/visiveis")
    public String planetas(ModelMap model){
    	PlanetaVisivelResponseDTO planetaVisiveis = planetaVisiveisService.getPlanetaVisivel();

    	model.addAttribute("planetaVisiveis", planetaVisiveis);

        System.out.println(planetaVisiveis.toString());

        return "paginas/planeta/visiveis";
    }
}
