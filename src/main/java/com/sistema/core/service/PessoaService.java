package com.sistema.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.core.mapper.PessoaDTOMapper;
import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.PessoaDTO;
import com.sistema.core.model.pessoa.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;

	@Autowired
	private PessoaDTOMapper mapper;

	public List<Pessoa> listar() {
		return repository.findAll();
	}

	public Pessoa buscar(Long id) {

		Pessoa resultado = null;

		Optional<Pessoa> op = repository.findById(id);
		if (op.isPresent()) {
			resultado = op.get();
		} else {
			resultado = new Pessoa();
			resultado.setNome("Produto não encontrado");
		}

		return resultado;
	}

	public Pessoa criar(PessoaDTO dto) {
		Pessoa entity = mapper.toEntity(dto);

		Pessoa criado = repository.save(entity);
		return criado;
	}

	public Pessoa alterar(PessoaDTO dto) {

		Pessoa entity = mapper.toEntity(dto);
		Pessoa alterado = repository.save(entity);
		
		return alterado;
	}

	public String excluir(Long id) {
		String excluido = "Produto excluido";
		repository.deleteById(id);

		return excluido;

	}

}
