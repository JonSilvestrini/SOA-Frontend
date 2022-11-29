package fatec.soa.nasa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fatec.soa.nasa.dto.request.PlanetaDetalheDTO;
import fatec.soa.nasa.services.PlanetaDetalheService;

@RequestMapping("/paginas")
@Controller
public class PlanetaController {

    @Autowired
	private PlanetaDetalheService planetaService;
    
    @GetMapping("/planeta/detalhe/{name}")
    public String paginas(@PathVariable("name") String name, ModelMap model){

        PlanetaDetalheDTO planetaDetalhe = planetaService.getPlanetaDetalhe(name);

        model.addAttribute("planetaDetalhe", planetaDetalhe);

        return "paginas/planeta";
    }
}
