package br.com.zarpsystem.springrestprometheus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TesteController {

    @GetMapping("teste")
    public @ResponseBody  String teste() {
        return "teste";
    }

}
