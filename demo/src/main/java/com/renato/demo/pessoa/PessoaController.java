package com.renato.demo.pessoa;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import converter.Converter;

@RestController
@RequestMapping("/api/alunos")
public class PessoaController {
	
    private final PessoaRepository repository;
    private final Converter converter;

	public PessoaController(PessoaRepository repository, Converter converter) {
		this.repository = repository;
		this.converter = converter;
	}
	
//	@GetMapping
//	public ResponseEntity<List<PessoaRequest>> findAll() {
//		List<Pessoa> lista = repository.findAll();
//		List<PessoaRequest> pessoasRequest = lista.stream().map(pessoa -> new PessoaRequest(pessoa)).collect(Collectors.toList());
//		return ResponseEntity.ok().body(pessoasRequest) ;
//		
//	}
	
	@GetMapping
	public ResponseEntity<List<PessoaRequest>> findAll() {
		List<Pessoa> lista = repository.findAll();
		List<PessoaRequest> pessoasRequest = converter.converter(lista);
		return ResponseEntity.ok().body(pessoasRequest) ;
	}
	
}
