package com.sistema.core.model.ordemservico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.ordemservico.OrdemServico;
import com.sistema.core.model.ordemservico.dto.OrdemServicoChangeDTO;

@Mapper(componentModel = "spring")
public interface OrdemServicoDTOChangeMapper {

	OrdemServico toEntity(OrdemServicoChangeDTO dto);
	OrdemServicoChangeDTO toDTO(OrdemServico entity);
	
	List<OrdemServico> toEntity(List<OrdemServicoChangeDTO> dto);
	List<OrdemServicoChangeDTO> toDTO(List<OrdemServico> entity);

}
