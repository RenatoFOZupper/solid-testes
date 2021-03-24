package com.renato.demo.pessoa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String email;
	private Cargo cargo;
	
	/**
	 * DEPRECATED -> HIBERNATE ONLY
	 */
		
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String email, Cargo cargo) {
		this.nome = nome;
		this.email = email;
		this.cargo = cargo;
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
