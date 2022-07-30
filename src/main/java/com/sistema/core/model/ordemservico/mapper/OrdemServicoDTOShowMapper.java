package com.sistema.core.model.ordemservico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.ordemservico.OrdemServico;
import com.sistema.core.model.ordemservico.dto.OrdemServicoShowDTO;

@Mapper(componentModel = "spring")
public interface OrdemServicoDTOShowMapper {

	OrdemServico toEntity(OrdemServicoShowDTO dto);

	OrdemServicoShowDTO toDTO(OrdemServico entity);

	List<OrdemServico> toEntity(List<OrdemServicoShowDTO> dto);

	List<OrdemServicoShowDTO> toDTO(List<OrdemServico> entity);

}
