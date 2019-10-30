package br.usjt.demo;

import javax.persistence.Persistence;

public class TestCreateBaseAndTables {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("previsao");
		}

}
