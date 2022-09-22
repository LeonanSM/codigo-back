package com.sistema.core.model.ordemservicoitem;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemDTOChange;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemDTOCreate;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemDTOList;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemDTOShow;
import com.sistema.core.model.ordemservicoitem.mapper.OrdemServicoItemDTOChangeMapper;
import com.sistema.core.model.ordemservicoitem.mapper.OrdemServicoItemDTOCreateMapper;
import com.sistema.core.model.ordemservicoitem.mapper.OrdemServicoItemDTOListMapper;
import com.sistema.core.model.ordemservicoitem.mapper.OrdemServicoItemDTOShowMapper;

public class OrdemServicoItemService {

	
	  @Autowired
	    private OrdemServicoItemRepository repository;

	    @Autowired
	    private OrdemServicoItemDTOListMapper dtoListMapper;

	    @Autowired
	    private OrdemServicoItemDTOShowMapper dtoShowMapper;

	    @Autowired
	    private OrdemServicoItemDTOCreateMapper dtoCreateMapper;

	    @Autowired
	    private OrdemServicoItemDTOChangeMapper dtoChangeMapper;


	    public List<OrdemServicoItemDTOList> listar() {


	        return dtoListMapper.toDto(repository.findAll());

	    }

	    public OrdemServicoItemDTOShow buscarPorId(Long id) {

	        Optional<OrdemServicoItem> optional = repository.findById(id);

	        if (!optional.isPresent()) {
	            throw new RuntimeException("Itens inexistentes!");
	        }
	        return dtoShowMapper.toDto(optional.get());
	    }

	    public OrdemServicoItemDTOShow criar(OrdemServicoItemDTOCreate dto) {

	        OrdemServicoItem ordemServicoItem = dtoCreateMapper.toEntity(dto);
	        ordemServicoItem = repository.save(ordemServicoItem);

	        return dtoShowMapper.toDto(ordemServicoItem);

	    }

	    public OrdemServicoItemDTOShow alterar(OrdemServicoItemDTOChange dto) {

	        OrdemServicoItem ordemServicoItem = dtoChangeMapper.toEntity(dto);

	        ordemServicoItem = repository.save(ordemServicoItem);

	        return dtoShowMapper.toDto(ordemServicoItem);
	    }

	    public String excluir(Long id) {
	        String excluido = "Pessoa excluido";
	        repository.deleteById(id);

	        return excluido;
	    }

	
}
