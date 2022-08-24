package com.sistema.core.model.ordemservico.mapper;

import org.mapstruct.Mapper;

import com.sistema.core.model.abstractions.BaseMapper;
import com.sistema.core.model.ordemservico.OrdemServico;
import com.sistema.core.model.ordemservico.dto.OrdemServicoDTOList;
import com.sistema.core.model.ordemservicoitem.mapper.OrdemServicoItemListDTOMapper;
import com.sistema.core.model.pessoa.mapper.PessoaListDTOMapper;

@Mapper(componentModel = "spring",uses= {OrdemServicoItemListDTOMapper.class, PessoaListDTOMapper.class})
public interface OrdemServicoDTOListMapper extends BaseMapper<OrdemServico, OrdemServicoDTOList> {



}
