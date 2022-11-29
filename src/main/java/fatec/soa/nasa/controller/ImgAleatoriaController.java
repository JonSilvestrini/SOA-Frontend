package fatec.soa.nasa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fatec.soa.nasa.dto.request.ImagemAleatoriaDTO;
import fatec.soa.nasa.services.ImagemAleatoriaService;

@RequestMapping("/paginas")
@Controller
public class ImgAleatoriaController {

    @Autowired
	private ImagemAleatoriaService imagemAleatoriaService;
    
    @GetMapping("/imagem")
    public String imgAleatoria(ModelMap model){

        ImagemAleatoriaDTO imagemAleatoria = imagemAleatoriaService.getImagemAleatatoria();

        model.addAttribute("imagemAleatoria", imagemAleatoria);

        return "paginas/imagem_aleatoria";
    }
}
