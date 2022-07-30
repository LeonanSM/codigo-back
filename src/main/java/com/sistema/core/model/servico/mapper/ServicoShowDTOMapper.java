package com.sistema.core.model.servico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.servico.Servico;
import com.sistema.core.model.servico.dto.ServicoShowDTO;

@Mapper(componentModel = "spring")
public interface ServicoShowDTOMapper {

	Servico toEntity(ServicoShowDTO dto);

	ServicoShowDTO toDTO(Servico entity);

	List<Servico> toEntity(List<ServicoShowDTO> dto);
	
	List<ServicoShowDTO> toDTO(List<Servico> entity);
}
