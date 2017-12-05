package br.com.caelum.contas.controller;

import br.com.caelum.contas.dao.UsuarioDAO;
import br.com.caelum.contas.modelo.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author wagner on 04/12/17
 */
@Controller
public class LoginController {

    @RequestMapping("/loginForm")
    public String formulario(){
        return "usuario/login";
    }

    @RequestMapping("/efetuaLogin")
    public String efetuaLogin(Usuario usuario, HttpSession session){
        UsuarioDAO dao = new UsuarioDAO();

        if (dao.existeUsuario(usuario)){
            session.setAttribute("usuarioLogado", usuario);
            return "view/menu";
        }

        return "redirect:loginForm";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:loginForm";
    }

}
