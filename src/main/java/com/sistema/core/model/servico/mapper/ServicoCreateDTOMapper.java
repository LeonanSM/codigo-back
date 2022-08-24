package com.sistema.core.model.servico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.servico.Servico;
import com.sistema.core.model.servico.dto.ServicoDTOCreate;

@Mapper(componentModel = "spring")
public interface ServicoCreateDTOMapper {

	Servico toEntity(ServicoDTOCreate dto);

	ServicoDTOCreate toDTO(Servico entity);

	List<Servico> toEntity(List<ServicoDTOCreate> dto);
	
	List<ServicoDTOCreate> toDTO(List<Servico> entity);
}
