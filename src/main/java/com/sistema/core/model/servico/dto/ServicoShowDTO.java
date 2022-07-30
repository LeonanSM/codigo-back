package com.sistema.core.model.servico.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;

public class ServicoShowDTO {

	private long id;

	@NotBlank
	private String nomeServico;

	
	private BigDecimal preco = BigDecimal.ZERO;

	private Integer quantidade;

	private String unidade;


	private String observacoes;

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNomeServico() {
		return nomeServico;
	}


	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}


	public BigDecimal getPreco() {
		return preco;
	}


	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public String getUnidade() {
		return unidade;
	}


	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}



	public String getObservacoes() {
		return observacoes;
	}


	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
	
}
