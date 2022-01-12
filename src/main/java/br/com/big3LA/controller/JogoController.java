package br.com.big3LA.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.big3LA.model.entities.Jogo;
import br.com.big3LA.model.repositories.JogoRepository;

@RestController
@RequestMapping("/big3/jogos")
public class JogoController {
	
	@Autowired
	JogoRepository repository;
	
	@PostMapping
	public Jogo inserirJogo(@Valid Jogo jogo) {
		repository.save(jogo);
		return jogo;
	}
	
	@GetMapping  //(path = "/{numeroPagina}")
	public Iterable<Jogo> obterJogo(){ //@PathVariable int numeroPagina
		//Pageable page = PageRequest.of(0, 41);
		return repository.findAll();
	}
	
	@PutMapping
	public Jogo alterarJogo(@Valid Jogo jogo) {
		repository.save(jogo);
		return jogo;
	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirJogo(@PathVariable int id) {
		repository.deleteById(id);
	}
	
}
