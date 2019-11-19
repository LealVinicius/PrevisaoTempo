package br.usjt.previsao.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
//@NamedQuery (name= "Cidade.buscarPorNome" , query = "SELECT a FROM Cidade a WHERE nome = :nome")
//@NamedQuery (name= "Cidade.buscarPorLatitudeELongitude" , query = "SELECT a FROM Cidade a WHERE latitude = :latitude AND "
	//	+ "longitude =: longitude"  )

public class Cidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nome;
	private String latitude;
	private String longitude;
	
	@OneToMany (mappedBy= "cidade")
	 List<PrevTempo> previsao;
	
	
	public long getId() {
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
