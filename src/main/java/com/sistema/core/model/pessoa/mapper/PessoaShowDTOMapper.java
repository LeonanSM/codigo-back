package com.sistema.core.model.pessoa.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.dto.PessoaShowDTO;

@Mapper(componentModel = "spring")
public interface PessoaShowDTOMapper {

	Pessoa toEntity(PessoaShowDTO dto);

	PessoaShowDTO toDTO(Pessoa entity);
	
	List<Pessoa> toEntity(List<PessoaShowDTO> dto);

	List<PessoaShowDTO> toDTO(List<Pessoa> entity);
}
