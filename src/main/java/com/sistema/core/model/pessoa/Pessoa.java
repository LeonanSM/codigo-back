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

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
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


}
