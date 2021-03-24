package com.renato.demo.pessoa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

	public List<Pessoa> findAll();
	
}
