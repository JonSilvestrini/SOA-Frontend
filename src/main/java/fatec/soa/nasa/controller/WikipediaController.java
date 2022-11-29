package fatec.soa.nasa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/paginas")
@Controller
public class WikipediaController {
    
    @GetMapping("/wikipedia")
    public String wikipedia(){
        return "paginas/wikipedia";
    }
}
