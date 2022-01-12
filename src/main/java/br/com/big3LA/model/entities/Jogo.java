package br.com.big3LA.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Jogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String adversario;
	@Min(0)
	private int pontosLakers;
	@Min(0)
	private int pontosAdversario;
	
	Jogo(){
		
	}
	
	Jogo(String adversario, int pontosLakers, int pontosAdversario){
		super();
		this.adversario = adversario;
		this.pontosLakers = pontosLakers;
		this.pontosAdversario = pontosAdversario;
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
	 * @return the adversario
	 */
	public String getAdversario() {
		return adversario;
	}
	/**
	 * @param adversario the adversario to set
	 */
	public void setAdversario(String adversario) {
		this.adversario = adversario;
	}
	/**
	 * @return the pontosLakers
	 */
	public int getPontosLakers() {
		return pontosLakers;
	}
	/**
	 * @param pontosLakers the pontosLakers to set
	 */
	public void setPontosLakers(int pontosLakers) {
		this.pontosLakers = pontosLakers;
	}
	/**
	 * @return the pontosAdversario
	 */
	public int getPontosAdversario() {
		return pontosAdversario;
	}
	/**
	 * @param pontosAdversario the pontosAdversario to set
	 */
	public void setPontosAdversario(int pontosAdversario) {
		this.pontosAdversario = pontosAdversario;
	}
	
	
	
}
