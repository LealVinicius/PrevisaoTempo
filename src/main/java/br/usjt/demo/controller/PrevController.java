package br.usjt.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.demo.model.PrevisaoTempo;
import br.usjt.demo.repository.prevRepository;

public class PrevController {
	@Autowired
	private prevRepository previsao;
	@GetMapping("/prev")
	public ModelAndView listarPrev() {
		ModelAndView mv = new ModelAndView("index.html");
		mv.addObject(new PrevisaoTempo());
		//List <PrevisaoTempo> 
		List<PrevisaoTempo> prev = previsao.findAll();
		mv.addObject("prev", prev);
		mv.addObject(new PrevisaoTempo());
		
		return mv;
	}
	@PostMapping
	public String salvar (PrevisaoTempo previsao) {
		//previsao.save(prev);
		return "redirect:/index";
	}
	
}
