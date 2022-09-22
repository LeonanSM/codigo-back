package com.sistema.core.model.ordemservicoitem.mapper;

import org.mapstruct.Mapper;

import com.sistema.core.model.abstractions.BaseMapper;
import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemDTOCreate;

@Mapper(componentModel = "spring")
public interface OrdemServicoItemDTOCreateMapper extends BaseMapper<OrdemServicoItem, OrdemServicoItemDTOCreate> {


}
