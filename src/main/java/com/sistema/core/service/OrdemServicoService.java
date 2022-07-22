package com.sistema.core.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.core.mapper.OrdemServicoDTOMapper;
import com.sistema.core.mapper.OrdemServicoItemDTOMapper;
import com.sistema.core.model.ordemservico.OrdemServico;
import com.sistema.core.model.ordemservico.OrdemServicoDTO;
import com.sistema.core.model.ordemservico.OrdemServicoRepository;
import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;
import com.sistema.core.model.ordemservicoitem.OrdemServicoItemRepository;
import com.sistema.core.model.servico.Servico;
import com.sistema.core.model.servico.ServicoRepository;

@Service
@Transactional
public class OrdemServicoService {

	@Autowired
	private OrdemServicoRepository repository;

	@Autowired
	private OrdemServicoDTOMapper mapper;

	@Autowired
	private OrdemServicoItemRepository repositoryItem;

	@Autowired
	private OrdemServicoItemDTOMapper mapperItem;
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	
	public List<OrdemServicoDTO> listar() {

		return mapper.toDTO(repository.findAll());

	}

	public OrdemServico buscar(Long id) {

		OrdemServico resultado = null;

		Optional<OrdemServico> op = repository.findById(id);
		if (op.isPresent()) {
			resultado = op.get();
		} else {
			resultado = new OrdemServico();
			resultado.setDescricaoServico("Não encontrado");
		}

		return resultado;
	}

	public OrdemServico criar(OrdemServicoDTO dto) {
		OrdemServico entity = mapper.toEntity(dto);
		for(OrdemServicoItem item : entity.getOrdemServicoItem()) {
			
			Servico servico = item.getServico();
			item.setServico(servicoRepository.findById(servico.getId()).get());
		}
		OrdemServico criado = repository.save(entity);
		
		return criado;
	}

	public OrdemServico alterar(OrdemServicoDTO dto) {

		OrdemServico entity = mapper.toEntity(dto);
		OrdemServico alterado = repository.save(entity);

		return alterado;
	}

	public String excluir(Long id) {
		String excluido = "Ordem excluida";
		repository.deleteById(id);

		return excluido;

	}

	public OrdemServicoItem incluirItem(OrdemServico dto) {
		OrdemServicoItem entity = (OrdemServicoItem) mapperItem.toDTO(dto.getOrdemServicoItem());

		OrdemServicoItem criado = repositoryItem.save(entity);
		return criado;
	}

}
