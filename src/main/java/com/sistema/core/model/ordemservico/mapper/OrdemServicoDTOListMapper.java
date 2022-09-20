package com.sistema.core.model.ordemservico.mapper;

import org.mapstruct.Mapper;

import com.sistema.core.model.abstractions.BaseMapper;
import com.sistema.core.model.ordemservico.OrdemServico;
import com.sistema.core.model.ordemservico.dto.OrdemServicoDTOList;

@Mapper(componentModel = "spring")
public interface OrdemServicoDTOListMapper extends BaseMapper<OrdemServico, OrdemServicoDTOList> {

}
