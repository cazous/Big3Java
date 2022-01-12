package br.com.big3LA.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.big3LA.model.entities.Jogo;

public interface JogoRepository extends PagingAndSortingRepository<Jogo, Integer>{

}
