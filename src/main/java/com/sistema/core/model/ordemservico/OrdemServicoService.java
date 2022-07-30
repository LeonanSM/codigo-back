package com.sistema.core.model.ordemservico;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.core.model.ordemservico.dto.OrdemServicoChangeDTO;
import com.sistema.core.model.ordemservico.dto.OrdemServicoCreateDTO;
import com.sistema.core.model.ordemservico.dto.OrdemServicoListDTO;
import com.sistema.core.model.ordemservico.dto.OrdemServicoShowDTO;
import com.sistema.core.model.ordemservico.mapper.OrdemServicoDTOChangeMapper;
import com.sistema.core.model.ordemservico.mapper.OrdemServicoDTOCreateMapper;
import com.sistema.core.model.ordemservico.mapper.OrdemServicoDTOListMapper;
import com.sistema.core.model.ordemservico.mapper.OrdemServicoDTOShowMapper;

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

	public List<OrdemServicoListDTO> listar() {

		return dtoListMapper.toDTO(repository.findAll());

	}

	public OrdemServicoShowDTO buscarPorId(Long id) {

		Optional<OrdemServico> optional = repository.findById(id);

		if (!optional.isPresent()) {
			throw new RuntimeException("Ordem serviço inexistente!");
		}
		return dtoShowMapper.toDTO(optional.get());
	}

	public OrdemServicoShowDTO criar(OrdemServicoCreateDTO dto) {

		OrdemServico ordemServico = dtoCreateMapper.toEntity(dto);
		ordemServico = repository.save(ordemServico);

		return dtoShowMapper.toDTO(ordemServico);

	}

	public OrdemServicoShowDTO alterar(OrdemServicoChangeDTO dto) {

		OrdemServico ordemServico = dtoChangeMapper.toEntity(dto);

		ordemServico = repository.save(ordemServico);

		return dtoShowMapper.toDTO(ordemServico);
	}

	public String excluir(Long id) {
		String excluido = "Pessoa excluido";
		repository.deleteById(id);

		return excluido;
	}

}
