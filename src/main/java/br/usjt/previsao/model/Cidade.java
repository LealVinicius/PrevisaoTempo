package br.usjt.previsao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;


/*
  2. As previsões pertencem a cidades. 
  Há um relacionamento de 1 para N entre cidade e
  previsões.

   */

@Entity
@Getter
@Setter
public class Cidade {
	@Id
	@GeneratedValue
	@OneToMany (mappedBy= "cidade")
	private PrevTempo previsao;
	private int id;
	private String nome;
	private String latitude;
	private String longitude;
	
	
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
