package com.sistema.core.model.servico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.servico.Servico;
import com.sistema.core.model.servico.dto.ServicoCreateDTO;

@Mapper(componentModel = "spring")
public interface ServicoCreateDTOMapper {

	Servico toEntity(ServicoCreateDTO dto);

	ServicoCreateDTO toDTO(Servico entity);

	List<Servico> toEntity(List<ServicoCreateDTO> dto);
	
	List<ServicoCreateDTO> toDTO(List<Servico> entity);
}
