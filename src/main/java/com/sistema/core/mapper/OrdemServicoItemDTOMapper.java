package com.sistema.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemDTO;

@Mapper(componentModel = "spring")
public interface OrdemServicoItemDTOMapper {

	OrdemServicoItem toEntity(OrdemServicoItemDTO dto);

	OrdemServicoItemDTO toDTO(OrdemServicoItem entity);
	
	List<OrdemServicoItem> toEntity(List<OrdemServicoItemDTO> dto);

	List<OrdemServicoItemDTO> toDTO(List<OrdemServicoItem> entity);
}
