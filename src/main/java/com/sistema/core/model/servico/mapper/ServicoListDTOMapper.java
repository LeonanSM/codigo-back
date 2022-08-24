package com.sistema.core.model.servico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.servico.Servico;
import com.sistema.core.model.servico.dto.ServicoDTOList;

@Mapper(componentModel = "spring")
public interface ServicoListDTOMapper {

	Servico toEntity(ServicoDTOList dto);

	ServicoDTOList toDTO(Servico entity);

	List<Servico> toEntity(List<ServicoDTOList> dto);
	
	List<ServicoDTOList> toDTO(List<Servico> entity);
}
