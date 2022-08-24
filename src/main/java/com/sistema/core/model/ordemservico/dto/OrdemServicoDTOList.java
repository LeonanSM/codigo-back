package com.sistema.core.model.ordemservico.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.sistema.core.model.ordemservico.StatusOrdem;
import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrdemServicoDTOList {

	private Long id;

	private String descricaoServico;

	private BigDecimal valorBruto;

	private BigDecimal valorLiquido;

	private BigDecimal valorDesconto;

	private Double percentualDesconto;

	private StatusOrdem status;

	private LocalDateTime data;

	private LocalDateTime inicio;

	private LocalDateTime fim;
	
	private List<OrdemServicoItem> ordemServicoItem = new ArrayList<OrdemServicoItem>();

	
}
