package com.sistema.core.model.pessoa.mapper;

import org.mapstruct.Mapper;

import com.sistema.core.model.abstractions.BaseMapper;
import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.dto.PessoaDTOShow;

@Mapper(componentModel = "spring")
public interface PessoaShowDTOMapper extends BaseMapper<Pessoa, PessoaDTOShow> {

}
