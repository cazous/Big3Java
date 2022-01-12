package br.com.big3LA.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.big3LA.model.entities.Estatistica;
import br.com.big3LA.model.entities.Jogador;
import br.com.big3LA.model.repositories.EstatisticaRepository;
import br.com.big3LA.model.repositories.JogadorRepository;

@RestController
@RequestMapping(path = "big3/estatisticas")
public class EstatisticaController {
	
	@Autowired
	EstatisticaRepository repository;
	@Autowired
	JogadorRepository repositoryJogador;
	
	@PostMapping
	public Estatistica inserirEstatistica(@Valid Estatistica estatistica) {
		repository.save(estatistica);
		return estatistica;
	}
	
	@GetMapping//(path = "/{idPagina}")
	public Iterable<Estatistica> obterEstatistica() { 
		
		return repository.findAll(); //page
	}
	
	@PutMapping
	public Estatistica alterarEstatistica(@Valid Estatistica estatistica) {
		repository.save(estatistica);
		return estatistica;
	}
	
	@DeleteMapping (path = "/{id}")
	public void excluirEstatistica(@PathVariable int id) {
		repository.deleteById(id);
	}
	
	@PutMapping(path = "/inserir/{jogador}/{estatistica}")
	public void addEstatisticaAoJogador(@PathVariable Jogador jogador, @PathVariable Estatistica estatistica) {
		jogador.setPontosTotais(jogador.getPontosTotais() + estatistica.getPontos());
		jogador.setRebotesTotais(jogador.getRebotesTotais() + estatistica.getRebotes());
		jogador.setAssistenciasTotais(jogador.getAssistenciasTotais() + estatistica.getAssistencias());
		jogador.setQtdJogos(jogador.getQtdJogos() + 1);
		
		repositoryJogador.save(jogador);
	}
	
	
}
