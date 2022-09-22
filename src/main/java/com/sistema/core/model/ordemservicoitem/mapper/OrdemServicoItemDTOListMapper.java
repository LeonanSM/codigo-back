package com.sistema.core.model.ordemservicoitem.mapper;

import org.mapstruct.Mapper;

import com.sistema.core.model.abstractions.BaseMapper;
import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemDTOList;

@Mapper(componentModel = "spring")
public interface OrdemServicoItemDTOListMapper extends BaseMapper<OrdemServicoItem, OrdemServicoItemDTOList> {


}
