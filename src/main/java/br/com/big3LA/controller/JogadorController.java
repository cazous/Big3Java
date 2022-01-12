package br.com.big3LA.controller;

import java.util.function.BiFunction;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.big3LA.model.entities.Jogador;
import br.com.big3LA.model.repositories.JogadorRepository;

@RestController
@RequestMapping(path = "big3/jogadores")
public class JogadorController {
	
	@Autowired
	JogadorRepository repository;
	
	@PostMapping
	public Jogador inserirJogador(@Valid Jogador jogador) {
		repository.save(jogador);
		return jogador;
	}
	
	@GetMapping
	public Iterable<Jogador> obterJogador() {
		return repository.findAll();
	}
	
	@PutMapping
	public Jogador alterarJogador(@Valid Jogador jogador) {
		repository.save(jogador);
		return jogador;
	}
	
	@DeleteMapping(path = "/{id}")
	public void deletarJogador(int id) {
		repository.deleteById(id);
	}
	
	BiFunction<Integer, Integer, Double> calcularMedia = (total, qtdJogos) -> {
		double resultado = total/qtdJogos;
		return resultado;
	};
	
	//Metodo pra calcular aproveitamento (lambda)
}
