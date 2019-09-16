package br.usjt.previsao.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsao.model.Usuario;
import br.usjt.previsao.service.PrevService;
import br.usjt.previsao.service.UsuarioService;

@Controller
public class LoginController {
	@Autowired
	private UsuarioService loginService;

	@GetMapping(value = { "/login", "/" })
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject(new Usuario());
		return mv;
	}

	@PostMapping("/fazerLogin")
	public String fazerLogin(Usuario usuario) {
		if (loginService.logar(usuario)) {
			return "redirect:index";
		} else {
			return "login";
		}
	}
}
