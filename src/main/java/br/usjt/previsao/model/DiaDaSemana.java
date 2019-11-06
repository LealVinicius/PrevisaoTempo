package br.usjt.previsao.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class DiaDaSemana {
	@OneToOne(optional=false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private PrevTempo prev;
	private String dia;
	
	
	public PrevTempo getPrev() {
		return prev;
	}
	public void setPrev(PrevTempo prev) {
		this.prev = prev;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
}
