package com.sistema.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.PessoaDTO;

@Mapper(componentModel = "spring")
public interface PessoaDTOMapper {

	Pessoa toEntity(PessoaDTO dto);

	PessoaDTO toDTO(Pessoa entity);
	
	List<Pessoa> toEntity(List<PessoaDTO> dto);

	List<PessoaDTO> toDTO(List<Pessoa> entity);
}
