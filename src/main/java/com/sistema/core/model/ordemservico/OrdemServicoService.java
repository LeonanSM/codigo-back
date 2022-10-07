package com.sistema.core.model.ordemservico;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.core.model.ordemservico.dto.OrdemServicoDTOChange;
import com.sistema.core.model.ordemservico.dto.OrdemServicoDTOCreate;
import com.sistema.core.model.ordemservico.dto.OrdemServicoDTOList;
import com.sistema.core.model.ordemservico.dto.OrdemServicoDTOShow;
import com.sistema.core.model.ordemservico.mapper.OrdemServicoDTOChangeMapper;
import com.sistema.core.model.ordemservico.mapper.OrdemServicoDTOCreateMapper;
import com.sistema.core.model.ordemservico.mapper.OrdemServicoDTOListMapper;
import com.sistema.core.model.ordemservico.mapper.OrdemServicoDTOShowMapper;
import com.sistema.core.model.ordemservicoitem.dto.OrdemServicoItemDTOCreate;

@Service
@Transactional
public class OrdemServicoService {

	@Autowired
	private OrdemServicoRepository repository;

	@Autowired
	private OrdemServicoDTOListMapper dtoListMapper;

	@Autowired
	private OrdemServicoDTOShowMapper dtoShowMapper;

	@Autowired
	private OrdemServicoDTOCreateMapper dtoCreateMapper;

	@Autowired
	private OrdemServicoDTOChangeMapper dtoChangeMapper;

	public List<OrdemServicoDTOList> listar() {

		return dtoListMapper.toDto(repository.findAll());

	}

	public OrdemServicoDTOShow buscarPorId(Long id) {

		Optional<OrdemServico> optional = repository.findById(id);

		if (!optional.isPresent()) {
			throw new RuntimeException("Ordem serviço inexistente!");
		}
		return dtoShowMapper.toDto(optional.get());
	}

	public OrdemServicoDTOShow criar(OrdemServicoDTOCreate dto) {

		//Inicio

		List<OrdemServicoItemDTOCreate> itens = dto.getItens();

		OrdemServico ordemServico = dtoCreateMapper.toEntity(dto);
		OrdemServico ordemSalva = repository.save(ordemServico);

		/*
		 * OrdemServico ordemServico = dtoCreateMapper.toEntity(dto); ordemServico =
		 * repository.save(ordemServico);
		 * 
		 * return dtoShowMapper.toDto(ordemServico);
		 */
		
		// fim
		
		return null;
	}

	public OrdemServicoDTOShow alterar(OrdemServicoDTOChange dto) {

		OrdemServico ordemServico = dtoChangeMapper.toEntity(dto);

		ordemServico = repository.save(ordemServico);

		return dtoShowMapper.toDto(ordemServico);
	}

	public String excluir(Long id) {
		String excluido = "Pessoa excluido";
		repository.deleteById(id);

		return excluido;
	}

}
