package br.usjt.previsao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.previsao.model.PrevTempo;
import br.usjt.previsao.repository.PrevRepository;

public class PrevService {
	@Autowired
	private PrevRepository prevRepo;
	
	public void salvar (PrevTempo previsao) {
		prevRepo.save(previsao);
	}
	public List <PrevTempo> listardias() {
		return prevRepo.findAll();
	}
}
