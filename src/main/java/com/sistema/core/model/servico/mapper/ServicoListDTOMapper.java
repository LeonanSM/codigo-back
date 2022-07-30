package com.sistema.core.model.servico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.servico.Servico;
import com.sistema.core.model.servico.dto.ServicoListDTO;

@Mapper(componentModel = "spring")
public interface ServicoListDTOMapper {

	Servico toEntity(ServicoListDTO dto);

	ServicoListDTO toDTO(Servico entity);

	List<Servico> toEntity(List<ServicoListDTO> dto);
	
	List<ServicoListDTO> toDTO(List<Servico> entity);
}
