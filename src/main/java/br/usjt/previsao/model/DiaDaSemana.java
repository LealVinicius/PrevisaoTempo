package br.usjt.previsao.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class DiaDaSemana {
	@OneToOne
	private PrevTempo prev;
	
	public PrevTempo getPrev(){
		return prev;
	}
	public void setPrev(PrevTempo prev) {
		this.prev = prev;
	}
	
	
	private String dia;
}
