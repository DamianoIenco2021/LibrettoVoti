package it.polito.tdp.model;

import java.time.LocalDate;

//POJO Plan Old Java Object
//JAVA BEAN

// semploice classe che contiene dati

/*
 * Costruttore della classe voto
 * @param nome Nome del corso
 * @param voto Voto ottenuto
 * @param data data di superamento esame
 */

public class Voto {
	private String nomeCorso;
	private int voto;
	private LocalDate data;
	
	public Voto(String nomeCorso, int voto, LocalDate data) {
		super();
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.data = data;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + nomeCorso + "superato con: " + voto + " il " + data ;
	}

	
	
	

}
