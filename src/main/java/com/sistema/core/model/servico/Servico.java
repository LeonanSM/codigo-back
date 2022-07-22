package com.sistema.core.model.servico;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;

@Entity
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "nomeservico")
	private String nomeServico;

	private BigDecimal preco = BigDecimal.ZERO;

	private Integer quantidade;

	private String unidade;

	private String observacoes;

	@OneToMany(mappedBy = "servico")
	private List<OrdemServicoItem> ordemServicoItem;

	public Servico() {
		// TODO Auto-generated constructor stub
	}

	public Servico(long id, String nomeServico, BigDecimal preco, Integer quantidade, String unidade,
			String observacoes) {
		super();
		this.id = id;
		this.nomeServico = nomeServico;
		this.preco = preco;
		this.quantidade = quantidade;
		this.unidade = unidade;
		this.observacoes = observacoes;
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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco ;
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

	public List<OrdemServicoItem> getOrdemServicoItem() {
		return ordemServicoItem;
	}

	public void setOrdemServicoItem(List<OrdemServicoItem> ordemServicoItem) {
		this.ordemServicoItem = ordemServicoItem;
	}

}
