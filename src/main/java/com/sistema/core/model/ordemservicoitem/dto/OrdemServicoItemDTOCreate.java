package com.sistema.core.model.ordemservicoitem.dto;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.sistema.core.model.servico.dto.ServicoDTOCreate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrdemServicoItemDTOCreate {

    private long id;

    private String nomeServico;

    private BigDecimal valor;

    @NotNull
    private BigDecimal quantidade;

    private String unidade;

    private Double percentualDesconto;

    private BigDecimal valorDesconto;

    private BigDecimal valorBruto;
    
    private List<OrdemServicoItemDTOCreate> itens;

    private ServicoDTOCreate servico;
    private Long servicoId;
    


}
