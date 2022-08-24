package com.sistema.core.model.servico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.servico.Servico;
import com.sistema.core.model.servico.dto.ServicoDTOShow;

@Mapper(componentModel = "spring")
public interface ServicoShowDTOMapper {

	Servico toEntity(ServicoDTOShow dto);

	ServicoDTOShow toDTO(Servico entity);

	List<Servico> toEntity(List<ServicoDTOShow> dto);
	
	List<ServicoDTOShow> toDTO(List<Servico> entity);
}
