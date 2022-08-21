package com.sistema.core.model.ordemservico.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.sistema.core.model.ordemservico.StatusOrdem;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemCreateDTO;
import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.dto.PessoaCreateDTO;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
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

    private PessoaCreateDTO pessoa;

    private List<OrdemServicoItemCreateDTO> ordemServicoItens = new ArrayList<>();



}
