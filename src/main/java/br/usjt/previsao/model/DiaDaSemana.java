package br.usjt.previsao.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class DiaDaSemana {
	@OneToOne(optional=false)
	private PrevTempo prev;
	private String dia;
}
