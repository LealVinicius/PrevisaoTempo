package br.usjt.previsao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsao.model.PrevTempo;
import br.usjt.previsao.repository.PrevRepository;

public class PrevController {
	@Autowired
	private PrevRepository previsaoRepo;

	@GetMapping("/")
	public ModelAndView listarPrev() {
		ModelAndView mv = new ModelAndView("index.html");
		mv.addObject(new PrevTempo());
		List<PrevTempo> prev = previsaoRepo.findAll();
		mv.addObject("prev", prev);
		mv.addObject(new PrevTempo());

		return mv;
	}
/* MÉTODO PARA RETORNAR A PÁGINA INICIAL
	@PostMapping
	public String salvar(PrevTempo previsao) {
		// PrevRepo.save(prev);
		return "redirect:/index";
	}
*/
}
