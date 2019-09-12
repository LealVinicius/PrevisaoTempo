package br.usjt.previsao.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsao.model.PrevTempo;

public interface PrevRepository extends JpaRepository<PrevTempo, Integer> {

}
