package com.sistema.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.servico.Servico;
import com.sistema.core.model.servico.ServicoDTO;

@Mapper(componentModel = "spring")
public interface ServicoDTOMapper {

	Servico toEntity(ServicoDTO dto);

	ServicoDTO toDTO(Servico entity);

	List<Servico> toEntity(List<ServicoDTO> dto);
	
	List<ServicoDTO> toDTO(List<Servico> entity);
}
