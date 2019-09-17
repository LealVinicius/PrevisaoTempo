package br.usjt.previsao.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import br.usjt.previsao.model.PrevTempo;
import br.usjt.previsao.service.PrevService;

public class PrevController {
	@Autowired
	private PrevService prevservice;

	@GetMapping(value = "/previsao")
	public ModelAndView listarPrev() {
		ModelAndView mv = new ModelAndView("index.html");
		mv.addObject(new PrevTempo());
		List<PrevTempo> prev = prevservice.listardias();
		mv.addObject("prev", prev);
		mv.addObject(new PrevTempo());
		return mv;
	}
     // MÉTODO PARA RETORNAR A PÁGINA INICIAL UTILIZANDO POST
	@PostMapping
	public String salvar(PrevTempo previsao) {
		prevservice.salvar(previsao);
		return "redirect:/index";
	}

}
