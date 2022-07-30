package com.sistema.core.model.pessoa.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.dto.PessoaCreateDTO;

@Mapper(componentModel = "spring")
public interface PessoaCreateDTOMapper {

	Pessoa toEntity(PessoaCreateDTO dto);

	PessoaCreateDTO toDTO(Pessoa entity);
	
	List<Pessoa> toEntity(List<PessoaCreateDTO> dto);

	List<PessoaCreateDTO> toDTO(List<Pessoa> entity);
}
