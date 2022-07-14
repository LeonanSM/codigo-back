package com.sistema.core.model.ordemservico;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sistema.core.model.servico.Servico;

@Entity
@Table(name = "ordemservicoitem")
public class OrdemServicoItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "nomeservico")
	private String nomeServico;

	private BigDecimal valor;

	private BigDecimal quantidade;

	private String unidade;

	@Column(name = "percentualdesconto")
	private Double percentualDesconto;

	private BigDecimal valorDesconto;

	@Column(name = "valorbruto")
	private BigDecimal valorBruto;

	@ManyToOne(fetch = FetchType.EAGER)
	private OrdemServico ordemServico;
	
	@ManyToOne
	private Servico servico;

	public OrdemServicoItem() {

	}

	public OrdemServicoItem(long id, String nomeServico, BigDecimal valor, BigDecimal quantidade, String unidade,
			Double percentualDesconto, BigDecimal valorDesconto, BigDecimal precoBruto, OrdemServico ordemServico) {
		super();
		this.id = id;
		this.nomeServico = nomeServico;
		this.valor = valor;
		this.quantidade = quantidade;
		this.unidade = unidade;
		this.percentualDesconto = percentualDesconto;
		this.valorDesconto = valorDesconto;
		this.valorBruto = precoBruto;
		this.ordemServico = ordemServico;
	}

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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public Double getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(Double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getPrecoBruto() {
		return valorBruto;
	}

	public void setPrecoBruto(BigDecimal precoBruto) {
		this.valorBruto = precoBruto;
	}

	public OrdemServico getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}

	public BigDecimal getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	
}
