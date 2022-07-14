package com.sistema.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.core.model.pessoa.Pessoa;
import com.sistema.core.model.pessoa.PessoaDTO;
import com.sistema.core.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaService service;

	@GetMapping("/listar")
	public List<Pessoa> listar() {

		return service.listar();
	}

	@GetMapping("/buscar")
	public Pessoa buscar(@RequestParam Long id) {
		return service.buscar(id);
	}

	@PostMapping("/criar")
	public Pessoa criar(@Valid @RequestBody PessoaDTO dto) {

		return service.criar(dto);
	}

	@PutMapping("/alterar")
	public Pessoa alterar(@Valid @RequestBody PessoaDTO dto) {

		return service.alterar(dto);
	}

	@DeleteMapping("/excluir")
	public void excluir(@RequestParam Long id) {

		service.excluir(id);
	}
}
