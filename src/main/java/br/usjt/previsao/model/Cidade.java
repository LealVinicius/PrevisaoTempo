package br.usjt.previsao.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@NamedQuery (name= "Cidade.buscarPorNome" , query = "SELECT a FROM Cidade a WHERE nome = :nome")
@NamedQuery (name= "Cidade.buscarPorLatitudeELongitude" , query = "SELECT a FROM Cidade a WHERE latitude = :latitude AND "
		+ "longitude =: longitude"  )

public class Cidade {
	@Id
	@GeneratedValue
	@OneToMany (mappedBy= "cidade")
	//private List<PrevTempo> previsao;
	private PrevTempo previsao;
	
	/* 2. As previsões pertencem a cidades. Há um relacionamento de 1 para N entre cidade e
previsões. Faça o mapeamento com as anotações da JPA.
*/
	private int id;
	private String nome;
	private String latitude;
	private String longitude;
	
	
	public PrevTempo getPrevisao() {
		return previsao;
	}
	public void setPrevisao(PrevTempo previsao) {
		this.previsao = previsao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
}
