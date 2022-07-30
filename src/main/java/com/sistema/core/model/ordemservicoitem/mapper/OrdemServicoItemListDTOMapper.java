package com.sistema.core.model.ordemservicoitem.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemListDTO;

@Mapper(componentModel = "spring")
public interface OrdemServicoItemListDTOMapper {

	OrdemServicoItem toEntity(OrdemServicoItemListDTO dto);

	OrdemServicoItemListDTO toDTO(OrdemServicoItem entity);
	
	List<OrdemServicoItem> toEntity(List<OrdemServicoItemListDTO> dto);

	List<OrdemServicoItemListDTO> toDTO(List<OrdemServicoItem> entity);
}
