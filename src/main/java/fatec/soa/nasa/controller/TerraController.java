package fatec.soa.nasa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fatec.soa.nasa.dto.request.terra.TerraImagemDTO;
import fatec.soa.nasa.services.TerraService;

@RequestMapping("/paginas")
@Controller
public class TerraController {
	@Autowired
	private TerraService terraService;

    @GetMapping("/terra/{date}")
    public String terra(@PathVariable("date") String date, ModelMap model){
    	TerraImagemDTO terraImagem = terraService.getPlanetaVisivel(date);

    	model.addAttribute("terraImagem", terraImagem);


        return "paginas/terra";
    }
}
