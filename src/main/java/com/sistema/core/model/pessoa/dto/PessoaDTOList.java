package com.sistema.core.model.pessoa.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.sistema.core.model.endereco.Endereco;

public class PessoaDTOList {

	private Long id;
	
	@NotBlank
	private String nome;

	private String razaoSocial;

	private String cpfCnpj;

	private String tipoPessoa;

	private LocalDate nascimento;

	private String contatoTelefone;

	private String contatoCelular;

	private String email;

	private Endereco endereco = new Endereco();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getContatoTelefone() {
		return contatoTelefone;
	}

	public void setContatoTelefone(String contatoTelefone) {
		this.contatoTelefone = contatoTelefone;
	}

	public String getContatoCelular() {
		return contatoCelular;
	}

	public void setContatoCelular(String contatoCelular) {
		this.contatoCelular = contatoCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
