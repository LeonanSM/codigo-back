package com.sistema.core.model.ordemservico;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;
import com.sistema.core.model.pessoa.Pessoa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

    private StatusOrdem status;

    private LocalDateTime data;

    private LocalDateTime inicio;

    private LocalDateTime fim;



    @ManyToOne(fetch = FetchType.EAGER)
    private Pessoa pessoa;

   @OneToMany(mappedBy = "ordemServico", cascade = CascadeType.PERSIST)
   private List<OrdemServicoItem> ordemServicoItem = new ArrayList<OrdemServicoItem>();



}
