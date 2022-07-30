package com.sistema.core.model.ordemservico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.ordemservico.OrdemServico;
import com.sistema.core.model.ordemservico.dto.OrdemServicoCreateDTO;

@Mapper(componentModel = "spring")
public interface OrdemServicoDTOCreateMapper {

	OrdemServico toEntity(OrdemServicoCreateDTO dto);
	OrdemServicoCreateDTO toDTO(OrdemServico entity);
	
	List<OrdemServico> toEntity(List<OrdemServicoCreateDTO> dto);
	List<OrdemServicoCreateDTO> toDTO(List<OrdemServico> entity);

}
