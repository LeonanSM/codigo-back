package com.sistema.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.core.mapper.OrdemServicoItemDTOMapper;
import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;
import com.sistema.core.model.ordemservicoitem.OrdemServicoItemRepository;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemDTO;

@Service
public class OrdemServicoServiceItem {


	@Autowired
	private OrdemServicoItemRepository repository;

	@Autowired
	private OrdemServicoItemDTOMapper mapper;

	public List<OrdemServicoItemDTO> listar() {
		
		return mapper.toDTO(repository.findAll()) ;
		
	}

	public OrdemServicoItem buscar(Long id) {

		OrdemServicoItem resultado = null;

		Optional<OrdemServicoItem> op = repository.findById(id);
		if (op.isPresent()) {
			resultado = op.get();
		} else {
			resultado = new OrdemServicoItem();
			resultado.setNomeServico("Não encontrado");
		}

		return resultado;
	}

	public OrdemServicoItem criar(OrdemServicoItemDTO dto) {
		OrdemServicoItem entity = mapper.toEntity(dto);

		OrdemServicoItem criado = repository.save(entity);
		return criado;
	}

	public OrdemServicoItem alterar(OrdemServicoItemDTO dto) {

		OrdemServicoItem entity = mapper.toEntity(dto);
		OrdemServicoItem alterado = repository.save(entity);
		
		return alterado;
	}

	public String excluir(Long id) {
		String excluido = "OrdemItem excluida";
		repository.deleteById(id);

		return excluido;

	}

	
}
