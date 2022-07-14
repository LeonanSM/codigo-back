package com.sistema.core.model.ordemservico;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.servico.Servico;

@Entity
@Table(name = "ordemservico")
public class OrdemServico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "descricaoservico")
	private String descricaoServico;

	@Column(name = "valorbruto")
	private BigDecimal valorBruto;

	@Column(name = "valorliquido")
	private BigDecimal valorLiquido;

	@Column(name = "valordesconto")
	private BigDecimal valorDesconto;

	@Column(name = "percentualdesconto")
	private Double percentualDesconto;

	private LocalDateTime data;

	private LocalDateTime inicio;

	private LocalDateTime fim;

	private StatusOrdem status;

	@ManyToOne(fetch = FetchType.EAGER)
	private Pessoa pessoa;

	@OneToMany(mappedBy = "ordemServico")
	private List<OrdemServicoItem> itemOrdemServico;

	public OrdemServico() {

	}

	public OrdemServico(Long id, String descricaoServico, BigDecimal valorBruto, BigDecimal valorLiquido,
			BigDecimal valorDesconto, Double percentualdesconto, LocalDateTime data, LocalDateTime inicioOs,
			LocalDateTime fimOs, Servico servico, StatusOrdem status, Pessoa pessoa, OrdemServicoItem itemOrdem) {
		super();
		this.id = id;
		this.descricaoServico = descricaoServico;
		this.valorBruto = valorBruto;
		this.valorLiquido = valorLiquido;
		this.valorDesconto = valorDesconto;
		this.percentualDesconto = percentualdesconto;
		this.data = data;
		this.inicio = inicioOs;
		this.fim = fimOs;
		this.status = status;
		this.pessoa = pessoa;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public void setValorLiquido(BigDecimal valoriquido) {
		this.valorLiquido = valoriquido;
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

	public void setPercentualDescTotal(Double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public LocalDateTime getInicioOs() {
		return inicio;
	}

	public void setInicioOs(LocalDateTime inicioOs) {
		this.inicio = inicioOs;
	}

	public LocalDateTime getFimOs() {
		return fim;
	}

	public void setFimOs(LocalDateTime fimOs) {
		this.fim = fimOs;
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

}
