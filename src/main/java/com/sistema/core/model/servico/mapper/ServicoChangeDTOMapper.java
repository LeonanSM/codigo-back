package com.sistema.core.model.servico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.servico.Servico;
import com.sistema.core.model.servico.dto.ServicoDTOChange;

@Mapper(componentModel = "spring")
public interface ServicoChangeDTOMapper {

	Servico toEntity(ServicoDTOChange dto);

	ServicoDTOChange toDTO(Servico entity);

	List<Servico> toEntity(List<ServicoDTOChange> dto);
	
	List<ServicoDTOChange> toDTO(List<Servico> entity);
}
