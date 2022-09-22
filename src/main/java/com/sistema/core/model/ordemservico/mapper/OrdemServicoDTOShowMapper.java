package com.sistema.core.model.ordemservico.mapper;

import org.mapstruct.Mapper;

import com.sistema.core.model.abstractions.BaseMapper;
import com.sistema.core.model.ordemservico.OrdemServico;
import com.sistema.core.model.ordemservico.dto.OrdemServicoDTOShow;
import com.sistema.core.model.ordemservicoitem.mapper.OrdemServicoItemDTOShowMapper;
import com.sistema.core.model.pessoa.mapper.PessoaShowDTOMapper;

@Mapper(componentModel = "spring",uses= {OrdemServicoItemDTOShowMapper.class, PessoaShowDTOMapper.class})
public interface OrdemServicoDTOShowMapper extends BaseMapper<OrdemServico, OrdemServicoDTOShow>{


}
