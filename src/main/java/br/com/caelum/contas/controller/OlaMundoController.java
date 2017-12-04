package br.com.caelum.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wagner on 21/11/17
 */
@Controller
public class OlaMundoController {

    @RequestMapping("/olamundo")
    public String olaMundo(Model model, @RequestParam(value="name", required = false, defaultValue = "World") String name){
        System.out.println("Mensagem no Console do olaMundo");
        model.addAttribute("name", name);
        return "olamundo";
    }

}
