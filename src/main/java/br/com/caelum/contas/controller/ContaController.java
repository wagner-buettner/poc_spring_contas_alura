package br.com.caelum.contas.controller;

import br.com.caelum.contas.dao.ContaDAO;
import br.com.caelum.contas.modelo.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * @author wagner on 22/11/17
 */

@Controller
public class ContaController {

    private ContaDAO dao;

    @Autowired
    public ContaController(ContaDAO dao){
        this.dao = dao;
    }

    @RequestMapping(value="/form")
    public String form() {
        return "formulario";
    }

    @RequestMapping("/adicionaConta")
    public String adiciona(@Valid Conta conta, BindingResult result) {

        // se tiver erro, redirecione para o formulário
        if(result.hasErrors()) {
            return "formulario";
        }

        dao.adiciona(conta);
        return "conta-adicionada";
    }

    @RequestMapping("/listaContas")
    public ModelAndView lista(){

        List<Conta> contas = dao.lista();

        ModelAndView mv = new ModelAndView("conta/lista");
        mv.addObject("todasContas", contas);

        return mv;
    }

    @RequestMapping("/removeConta")
    public String remove(Conta conta){
        dao.remove(conta);

        return "redirect:listaContas";
    }

    @RequestMapping("/mostraConta")
    public String mostra(Long id, Model model) {
        model.addAttribute("conta", dao.buscaPorId(id));
        return "conta/mostra";
    }

    @RequestMapping("/alteraConta")
    public String altera(Conta conta) {
        dao.altera(conta);
        return "redirect:listaContas";
    }

    @RequestMapping("/pagaConta")
    public void paga(Conta conta, HttpServletResponse response){
        dao.paga(conta.getId());

        response.setStatus(200);

        //return "redirect:listaContas";
    }
}
