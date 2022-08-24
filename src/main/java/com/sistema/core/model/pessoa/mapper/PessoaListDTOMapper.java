package com.sistema.core.model.pessoa.mapper;

import org.mapstruct.Mapper;

import com.sistema.core.model.abstractions.BaseMapper;
import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.dto.PessoaDTOList;

@Mapper(componentModel = "spring")
public interface PessoaListDTOMapper extends BaseMapper<Pessoa, PessoaDTOList> {

    
    // Pessoa toEntity(PessoaListDTO dto);
    // PessoaListDTO toDTO(Pessoa entity);
    // List<Pessoa> toEntity(List<PessoaListDTO> dto);
    // List<PessoaListDTO> toDTO(List<Pessoa> entity);
}
