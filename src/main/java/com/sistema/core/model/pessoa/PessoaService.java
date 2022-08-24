package com.sistema.core.model.pessoa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.core.model.pessoa.dto.PessoaDTOChange;
import com.sistema.core.model.pessoa.dto.PessoaDTOCreate;
import com.sistema.core.model.pessoa.dto.PessoaDTOList;
import com.sistema.core.model.pessoa.dto.PessoaDTOShow;
import com.sistema.core.model.pessoa.mapper.PessoaChangeDTOMapper;
import com.sistema.core.model.pessoa.mapper.PessoaCreateDTOMapper;
import com.sistema.core.model.pessoa.mapper.PessoaListDTOMapper;
import com.sistema.core.model.pessoa.mapper.PessoaShowDTOMapper;



@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;

	@Autowired
	private PessoaListDTOMapper dtoListMapper;
	
	@Autowired
	private PessoaShowDTOMapper dtoShowMapper;
	
	@Autowired
	private PessoaCreateDTOMapper dtoCreateMapper;
	
	@Autowired
	private PessoaChangeDTOMapper dtoChangeMapper;

	public List<PessoaDTOList> listar() {

	    
		return dtoListMapper.toDto(repository.findAll());

	}

	public PessoaDTOShow buscarPorId(Long id) {

		Optional<Pessoa> optional = repository.findById(id);

		if (!optional.isPresent()) {
			throw new RuntimeException("Pessoa não encontrada!");
		}
		return dtoShowMapper.toDto(optional.get());
	}

	public List<Pessoa> pesquisarPorNome(String nome) {

		List<Pessoa> list = repository.findByNomeContaining(nome);

		return list;
	}

	public PessoaDTOShow criar(PessoaDTOCreate dto) {
		
		Pessoa pessoa = dtoCreateMapper.toEntity(dto);
		pessoa = repository.save(pessoa);
		return dtoShowMapper.toDto(pessoa);
	}

	public Pessoa alterar(PessoaDTOChange dto) {

		Pessoa entity = dtoChangeMapper.toEntity(dto);
		Pessoa alterado = repository.save(entity);

		return alterado;
	}

	public String excluir(Long id) {
		String excluido = "Pessoa excluido";
		repository.deleteById(id);

		return excluido;

	}

}
