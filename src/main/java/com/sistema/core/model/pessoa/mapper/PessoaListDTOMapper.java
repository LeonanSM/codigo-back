package com.sistema.core.model.pessoa.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.dto.PessoaListDTO;

@Mapper(componentModel = "spring")
public interface PessoaListDTOMapper {

	Pessoa toEntity(PessoaListDTO dto);

	PessoaListDTO toDTO(Pessoa entity);
	
	List<Pessoa> toEntity(List<PessoaListDTO> dto);

	List<PessoaListDTO> toDTO(List<Pessoa> entity);
}
