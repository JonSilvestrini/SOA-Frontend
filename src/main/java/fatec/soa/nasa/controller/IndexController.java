package fatec.soa.nasa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fatec.soa.nasa.dto.request.IsAliveDTO;
import fatec.soa.nasa.services.IsAliveService;

@RequestMapping("/")
@Controller
public class IndexController {

	@Autowired
	private IsAliveService isAliveService;

    @GetMapping
    public String index(ModelMap model){

    	IsAliveDTO isAlive = isAliveService.getIsAlive();

    	model.addAttribute("isAlive", isAlive);

    	System.out.println(isAlive.toString());

        System.out.println("Passou pelo Controller Index...");
        return "index";
    }

}
