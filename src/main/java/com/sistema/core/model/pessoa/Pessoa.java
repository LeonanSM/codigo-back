package com.sistema.core.model.pessoa;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sistema.core.model.endereco.Endereco;
import com.sistema.core.model.ordemservico.OrdemServico;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 60)
	private String nome;

	@Column(name = "razaosocial", nullable = false, length = 60)
	private String razaoSocial;

	@Column(name = "cpfcnpj", nullable = false, length = 14)
	private String cpfCnpj;

	@Column(name = "tipopessoa", nullable = false)
	private String tipoPessoa;

	private LocalDate nascimento;

	@Column(name = "contatotelefone")
	private String contatoTelefone;

	@Column(name = "contatocelular")
	private String contatoCelular;

	private String email;

	private Endereco endereco = new Endereco();

	@OneToMany(mappedBy = "pessoa")
	private List<OrdemServico> ordemServico;

	public Pessoa() {

	}


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

	public void setEndereco(String endereco) {

		setEndereco(endereco);
	}

}
