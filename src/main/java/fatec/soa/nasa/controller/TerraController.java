package fatec.soa.nasa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClientRequestException;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import fatec.soa.nasa.dto.request.terra.TerraImagemDTO;
import fatec.soa.nasa.services.TerraService;

@RequestMapping("/paginas")
@Controller
public class TerraController {
	@Autowired
	private TerraService terraService;

	@GetMapping("/terra")
	public String terra(@RequestParam(name = "data", required = false) String date, ModelMap model) {
		if (date != null && !date.isBlank()) {
			try {
				List<TerraImagemDTO> terraImagem = terraService.getPlanetaVisivel(date);

				model.addAttribute("terraImagem", terraImagem);
				model.addAttribute("data", date);

				return "paginas/terraview";
			} catch (WebClientResponseException e) {
				if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
					model.addAttribute("data", date);
					return "paginas/terra_404";
				}
				return "paginas/terra";
			}
		} else {

			return "paginas/terra";
		}
	}

}
