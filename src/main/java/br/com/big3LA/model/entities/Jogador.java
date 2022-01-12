package br.com.big3LA.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Jogador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank
	private String nome;
	private int pontosTotais;
	private int rebotesTotais;
	private int assistenciasTotais;
	private double mediaPontos;
	private double mediaRebotes;
	private double mediaAssistencias;
	private int qtdJogos;
	
	Jogador(){
		
	}
	
	Jogador(String nome){
		this.nome = nome;
	}
	
	
	/**
	 * @return the qtdJogos
	 */
	public int getQtdJogos() {
		return qtdJogos;
	}

	/**
	 * @param qtdJogos the qtdJogos to set
	 */
	public void setQtdJogos(int qtdJogos) {
		this.qtdJogos = qtdJogos;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the pontosTotais
	 */
	public int getPontosTotais() {
		return pontosTotais;
	}

	/**
	 * @param pontosTotais the pontosTotais to set
	 */
	public void setPontosTotais(int pontosTotais) {
		this.pontosTotais = pontosTotais;
	}

	/**
	 * @return the rebotesTotais
	 */
	public int getRebotesTotais() {
		return rebotesTotais;
	}

	/**
	 * @param rebotesTotais the rebotesTotais to set
	 */
	public void setRebotesTotais(int rebotesTotais) {
		this.rebotesTotais = rebotesTotais;
	}

	/**
	 * @return the assistenciasTotais
	 */
	public int getAssistenciasTotais() {
		return assistenciasTotais;
	}

	/**
	 * @param assistenciasTotais the assistenciasTotais to set
	 */
	public void setAssistenciasTotais(int assistenciasTotais) {
		this.assistenciasTotais = assistenciasTotais;
	}

	/**
	 * @return the mediaPontos
	 */
	public double getMediaPontos() {
		return mediaPontos;
	}

	/**
	 * @param mediaPontos the mediaPontos to set
	 */
	public void setMediaPontos(double mediaPontos) {
		this.mediaPontos = mediaPontos;
	}

	/**
	 * @return the mediaRebotes
	 */
	public double getMediaRebotes() {
		return mediaRebotes;
	}

	/**
	 * @param mediaRebotes the mediaRebotes to set
	 */
	public void setMediaRebotes(double mediaRebotes) {
		this.mediaRebotes = mediaRebotes;
	}

	/**
	 * @return the mediaAssistencias
	 */
	public double getMediaAssistencias() {
		return mediaAssistencias;
	}

	/**
	 * @param mediaAssistencias the mediaAssistencias to set
	 */
	public void setMediaAssistencias(double mediaAssistencias) {
		this.mediaAssistencias = mediaAssistencias;
	}
	
	
	
}
