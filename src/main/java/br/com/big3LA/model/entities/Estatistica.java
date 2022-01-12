package br.com.big3LA.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;

@Entity
public class Estatistica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Jogo jogo;
	@OneToOne
	private Jogador jogador;
	@Min(0)
	private int pontos; //Jogo mais recente
	@Min(0)
	private int rebotes; //Jogo mais recente
	@Min(0)
	private int assistencias; //Jogo mais recente
	
	Estatistica(){
		
	}
	
	public Estatistica(Jogo jogo, Jogador jogador, int pontos, int rebotes, int assistencias) {
		super();
		this.jogo = jogo;
		this.jogador = jogador;
		this.pontos = pontos;
		this.rebotes = rebotes;
		this.assistencias = assistencias;
	}
	
	
	/**
	 * @return the jogador
	 */
	public Jogador getJogador() {
		return jogador;
	}

	/**
	 * @param jogador the jogador to set
	 */
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
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
	 * @return the jogo
	 */
	public Jogo getJogo() {
		return jogo;
	}
	/**
	 * @param jogo the jogo to set
	 */
	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	/**
	 * @return the pontos
	 */
	public int getPontos() {
		return pontos;
	}
	/**
	 * @param pontos the pontos to set
	 */
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	/**
	 * @return the rebotes
	 */
	public int getRebotes() {
		return rebotes;
	}
	/**
	 * @param rebotes the rebotes to set
	 */
	public void setRebotes(int rebotes) {
		this.rebotes = rebotes;
	}
	/**
	 * @return the assistencias
	 */
	public int getAssistencias() {
		return assistencias;
	}
	/**
	 * @param assistencias the assistencias to set
	 */
	public void setAssistencias(int assistencias) {
		this.assistencias = assistencias;
	}
	
	
	
}
