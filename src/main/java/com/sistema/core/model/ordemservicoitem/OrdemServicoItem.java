package com.sistema.core.model.ordemservicoitem;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sistema.core.model.ordemservico.OrdemServico;
import com.sistema.core.model.servico.Servico;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

    @ManyToOne
    private OrdemServico ordemServico;

    @ManyToOne
    private Servico servico;

}
