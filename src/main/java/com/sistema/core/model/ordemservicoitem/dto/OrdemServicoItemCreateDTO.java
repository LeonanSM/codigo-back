package com.sistema.core.model.ordemservicoitem.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import com.sistema.core.model.servico.dto.ServicoCreateDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrdemServicoItemCreateDTO {

    private long id;

    private String nomeServico;

    private BigDecimal valor;

    @NotNull
    private BigDecimal quantidade;

    private String unidade;

    private Double percentualDesconto;

    private BigDecimal valorDesconto;

    private BigDecimal valorBruto;

    private ServicoCreateDTO servico;
    private Long servicoId;


}
