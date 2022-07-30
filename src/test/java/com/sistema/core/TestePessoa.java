package com.sistema.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.PessoaRepository;



@SpringBootTest
public class TestePessoa {

	@Autowired
	private PessoaRepository repository;
	
	@Test
	public void testaPesquisaExata() {

		Optional<Pessoa> optional = repository.findByNome("Joao");
		
		assertEquals(true, optional.isPresent());
	}
	
	
	@Test
	public void testaPesquisaLike() {

		List<Pessoa> lista = repository.findByNomeContaining("o");
		
		for (Pessoa pessoa : lista) {
			
			System.out.println(pessoa.getNome());
		}
	}
}
	
