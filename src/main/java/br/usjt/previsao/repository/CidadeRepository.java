package br.usjt.previsao.repository;

import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;

import br.usjt.previsao.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	@Async
	public Future <Cidade> findByNomeContainingIgnoreCase (String nome);
	
	
	public Cidade findOneByLatitudeAndLongitude(String Latitude, String Longitude);

	
	
	
}
