package com.sistema.core.model.ordemservicoitem.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemCreateDTO;

@Mapper(componentModel = "spring")
public interface OrdemServicoItemCreateDTOMapper {

	OrdemServicoItem toEntity(OrdemServicoItemCreateDTO dto);

	OrdemServicoItemCreateDTO toDTO(OrdemServicoItem entity);
	
	List<OrdemServicoItem> toEntity(List<OrdemServicoItemCreateDTO> dto);

	List<OrdemServicoItemCreateDTO> toDTO(List<OrdemServicoItem> entity);
}
