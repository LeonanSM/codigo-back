package com.sistema.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.core.mapper.ServicoDTOMapper;
import com.sistema.core.model.servico.Servico;
import com.sistema.core.model.servico.ServicoDTO;
import com.sistema.core.model.servico.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository repository;

	@Autowired
	private ServicoDTOMapper mapper;

	public List<ServicoDTO> listar() {
		return mapper.toDTO(repository.findAll());
	}

	public Servico buscar(Long id) {

		Servico resultado = null;

		Optional<Servico> op = repository.findById(id);
		if (op.isPresent()) {
			resultado = op.get();
		} else {
			resultado = new Servico();
			resultado.setNomeServico("Serviço não encontrado");
		}

		return resultado;
	}
	
	public Servico criar(ServicoDTO dto) {
		
		Servico servico = mapper.toEntity(dto);
		Servico criado = repository.save(servico);
		
		return criado;
	}
	
	public Servico alterar(ServicoDTO dto) {
		
		Servico servico = mapper.toEntity(dto);
		Servico alterado = repository.save(servico);
		
		return alterado;
	}
	
	public String excluir(Long id) {
		String excluido = "Serviço excluido";
		repository.deleteById(id);

		return excluido;

	}

}
