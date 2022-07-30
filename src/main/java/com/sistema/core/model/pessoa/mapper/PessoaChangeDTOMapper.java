package com.sistema.core.model.pessoa.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.dto.PessoaChangeDTO;

@Mapper(componentModel = "spring")
public interface PessoaChangeDTOMapper{

	Pessoa toEntity(PessoaChangeDTO dto);

	PessoaChangeDTO toDTO(Pessoa entity);
	
	List<Pessoa> toEntity(List<PessoaChangeDTO> dto);

	List<PessoaChangeDTO> toDTO(List<Pessoa> entity);
}
