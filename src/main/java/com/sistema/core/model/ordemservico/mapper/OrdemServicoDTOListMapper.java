package com.sistema.core.model.ordemservico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.ordemservico.OrdemServico;
import com.sistema.core.model.ordemservico.dto.OrdemServicoListDTO;

@Mapper(componentModel = "spring")
public interface OrdemServicoDTOListMapper {

	OrdemServico toEntity(OrdemServicoListDTO dto);

	OrdemServicoListDTO toDTO(OrdemServico entity);

	List<OrdemServico> toEntity(List<OrdemServicoListDTO> dto);

	List<OrdemServicoListDTO> toDTO(List<OrdemServico> entity);

}
