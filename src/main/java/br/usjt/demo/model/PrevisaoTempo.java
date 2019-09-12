package br.usjt.demo.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter

public class PrevisaoTempo implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nomeDiaDaSemana;
	private int minima;
	private int maxima;
	private int humidade;
	private String descri;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	


}
