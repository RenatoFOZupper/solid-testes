package com.renato.demo.pessoa;

public class PessoaRequest {

	private Long id;
	private String nome;
	private String email;
	private Cargo cargo;
	
	public PessoaRequest(Pessoa pessoa) {
		this.id = pessoa.getId();
		this.nome = pessoa.getNome();
		this.email = pessoa.getEmail();
		this.cargo = pessoa.getCargo();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Cargo getCargo() {
		return cargo;
	}
	
	
	
}
