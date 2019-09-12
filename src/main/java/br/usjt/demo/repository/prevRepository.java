package br.usjt.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.demo.model.PrevisaoTempo;

public interface prevRepository extends JpaRepository<PrevisaoTempo, Integer> {

}
