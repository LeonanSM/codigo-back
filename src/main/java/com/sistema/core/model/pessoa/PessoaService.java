package com.sistema.core.model.pessoa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.core.model.pessoa.dto.PessoaChangeDTO;
import com.sistema.core.model.pessoa.dto.PessoaCreateDTO;
import com.sistema.core.model.pessoa.dto.PessoaListDTO;
import com.sistema.core.model.pessoa.dto.PessoaShowDTO;
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

	public List<PessoaListDTO> listar() {

		return dtoListMapper.toDTO(repository.findAll());

	}

	public PessoaShowDTO buscarPorId(Long id) {

		Optional<Pessoa> optional = repository.findById(id);

		if (!optional.isPresent()) {
			throw new RuntimeException("Pessoa não encontrada!");
		}
		return dtoShowMapper.toDTO(optional.get());
	}

	public List<Pessoa> pesquisarPorNome(String nome) {

		List<Pessoa> list = repository.findByNomeContaining(nome);

		return list;
	}

	public PessoaShowDTO criar(PessoaCreateDTO dto) {
		
		Pessoa pessoa = dtoCreateMapper.toEntity(dto);
		pessoa = repository.save(pessoa);
		return dtoShowMapper.toDTO(pessoa);
	}

	public Pessoa alterar(PessoaChangeDTO dto) {

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
