package com.sistema.core.model.ordemservico.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.sistema.core.model.ordemservico.StatusOrdem;
import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;
import com.sistema.core.model.pessoa.Pessoa;

public class OrdemServicoCreateDTO {

	
	private String descricaoServico;

	private BigDecimal valorBruto;

	private BigDecimal valorLiquido;

	private BigDecimal valorDesconto;

	private Double percentualDesconto;

	private LocalDateTime data;

	private LocalDateTime inicio;

	private LocalDateTime fim;

	private StatusOrdem status;

	private Pessoa pessoa;

	private List<OrdemServicoItem> ordemServicoItem = new ArrayList<OrdemServicoItem>();

	public String getDescricaoServico() {
		return descricaoServico;
	}

	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}

	public BigDecimal getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}

	public BigDecimal getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(BigDecimal valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Double getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(Double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public StatusOrdem getStatus() {
		return status;
	}

	public void setStatus(StatusOrdem status) {
		this.status = status;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<OrdemServicoItem> getOrdemServicoItem() {
		return ordemServicoItem;
	}

	public void setOrdemServicoItem(List<OrdemServicoItem> ordemServicoItem) {
		this.ordemServicoItem = ordemServicoItem;
	}



}
