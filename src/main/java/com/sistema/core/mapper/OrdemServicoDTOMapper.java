package com.sistema.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.ordemservico.OrdemServico;
import com.sistema.core.model.ordemservico.OrdemServicoDTO;





@Mapper(componentModel = "spring")
public interface OrdemServicoDTOMapper {

	OrdemServico toEntity(OrdemServicoDTO dto);
	OrdemServicoDTO toDTO(OrdemServico entity);
	
	List<OrdemServico> toEntity(List<OrdemServicoDTO> dto);
	List<OrdemServicoDTO> toDTO(List<OrdemServico> entity);

}
