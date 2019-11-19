package br.usjt.previsao.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;
import java.util.concurrent.Future;
import br.usjt.previsao.model.PrevTempo;

public interface PrevRepository extends JpaRepository<PrevTempo, Long> {
	
	@Async
	public Future <PrevTempo> findByLatitudeAndLongitude (String latitude, String longitude);

}
