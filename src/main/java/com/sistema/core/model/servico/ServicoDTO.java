package com.sistema.core.model.servico;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotBlank;

import com.sistema.core.model.ordemservico.OrdemServicoItem;

public class ServicoDTO {

	private long id;

	@NotBlank
	private String nomeServico;

	private BigDecimal preco = BigDecimal.ZERO;

	private Integer quantidade;

	private String unidade;

	private BigDecimal desconto;

	
	private Double percentualDesconto;
	
	
	private List<OrdemServicoItem> ordemServicoItem;

	
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


	public BigDecimal getDesconto() {
		return desconto;
	}


	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}


	public Double getPercentualDesconto() {
		return percentualDesconto;
	}


	public void setPercentualDesconto(Double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}


	public List<OrdemServicoItem> getOrdemServicoItem() {
		return ordemServicoItem;
	}


	public void setOrdemServicoItem(List<OrdemServicoItem> ordemServicoItem) {
		this.ordemServicoItem = ordemServicoItem;
	}
	
	
	
}
