package com.sistema.core.model.pessoa.mapper;

import org.mapstruct.Mapper;

import com.sistema.core.model.abstractions.BaseMapper;
import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.dto.PessoaDTOChange;

@Mapper(componentModel = "spring")
public interface PessoaChangeDTOMapper extends BaseMapper<Pessoa, PessoaDTOChange>{

}
