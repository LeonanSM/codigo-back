package com.sistema.core.model.ordemservicoitem.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemChangeDTO;

@Mapper(componentModel = "spring")
public interface OrdemServicoItemChangeDTOMapper {

	OrdemServicoItem toEntity(OrdemServicoItemChangeDTO dto);

	OrdemServicoItemChangeDTO toDTO(OrdemServicoItem entity);
	
	List<OrdemServicoItem> toEntity(List<OrdemServicoItemChangeDTO> dto);

	List<OrdemServicoItemChangeDTO> toDTO(List<OrdemServicoItem> entity);
}
