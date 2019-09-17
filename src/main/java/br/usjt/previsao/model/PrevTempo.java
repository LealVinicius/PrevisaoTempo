package br.usjt.previsao.model;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class PrevTempo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dia;
	private int minima;
	private int maxima;
	private int humidade;
	private String descri;
	private Date data;
	private int latitude;
	private int longitude;
	


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
