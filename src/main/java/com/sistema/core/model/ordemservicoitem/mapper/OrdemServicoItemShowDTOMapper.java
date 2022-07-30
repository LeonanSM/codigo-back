package com.sistema.core.model.ordemservicoitem.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemShowDTO;

@Mapper(componentModel = "spring")
public interface OrdemServicoItemShowDTOMapper {

	OrdemServicoItem toEntity(OrdemServicoItemShowDTO dto);

	OrdemServicoItemShowDTO toDTO(OrdemServicoItem entity);
	
	List<OrdemServicoItem> toEntity(List<OrdemServicoItemShowDTO> dto);

	List<OrdemServicoItemShowDTO> toDTO(List<OrdemServicoItem> entity);
}
