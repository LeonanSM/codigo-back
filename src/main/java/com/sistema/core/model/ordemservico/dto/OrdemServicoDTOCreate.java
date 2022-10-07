package com.sistema.core.model.ordemservico.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.sistema.core.model.ordemservico.StatusOrdem;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemDTOCreate;
import com.sistema.core.model.pessoa.dto.PessoaDTOCreate;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class OrdemServicoDTOCreate {


    private String descricaoServico;

    private BigDecimal valorBruto;

    private BigDecimal valorLiquido;

    private BigDecimal valorDesconto;

    private Double percentualDesconto;

    private LocalDateTime data;

    private LocalDateTime inicio;

    private LocalDateTime fim;

    private StatusOrdem status;

    private PessoaDTOCreate pessoa;

    private List<OrdemServicoItemDTOCreate> itens;

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

	public PessoaDTOCreate getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaDTOCreate pessoa) {
		this.pessoa = pessoa;
	}

	public List<OrdemServicoItemDTOCreate> getItens() {
		return itens;
	}

	public void setItens(List<OrdemServicoItemDTOCreate> itens) {
		this.itens = itens;
	}
	

}
