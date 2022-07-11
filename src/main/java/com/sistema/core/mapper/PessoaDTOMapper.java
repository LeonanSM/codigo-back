package com.sistema.core.mapper;

import org.mapstruct.Mapper;

import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.PessoaDTO;

@Mapper(componentModel = "spring")
public interface PessoaDTOMapper {

	Pessoa toEntity(PessoaDTO dto);

	PessoaDTO toDTO(Pessoa entity);
}
