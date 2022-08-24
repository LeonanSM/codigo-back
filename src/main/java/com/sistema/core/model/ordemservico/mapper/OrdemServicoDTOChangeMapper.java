package com.sistema.core.model.ordemservico.mapper;

import org.mapstruct.Mapper;

import com.sistema.core.model.abstractions.BaseMapper;
import com.sistema.core.model.ordemservico.OrdemServico;
import com.sistema.core.model.ordemservico.dto.OrdemServicoDTOChange;
import com.sistema.core.model.ordemservicoitem.mapper.OrdemServicoItemChangeDTOMapper;
import com.sistema.core.model.pessoa.mapper.PessoaChangeDTOMapper;

@Mapper(componentModel = "spring", uses= {OrdemServicoItemChangeDTOMapper.class, PessoaChangeDTOMapper.class})
public interface OrdemServicoDTOChangeMapper extends BaseMapper<OrdemServico, OrdemServicoDTOChange>{

}
