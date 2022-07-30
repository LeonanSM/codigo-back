package com.sistema.core.model.servico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.servico.Servico;
import com.sistema.core.model.servico.dto.ServicoChangeDTO;

@Mapper(componentModel = "spring")
public interface ServicoChangeDTOMapper {

	Servico toEntity(ServicoChangeDTO dto);

	ServicoChangeDTO toDTO(Servico entity);

	List<Servico> toEntity(List<ServicoChangeDTO> dto);
	
	List<ServicoChangeDTO> toDTO(List<Servico> entity);
}
