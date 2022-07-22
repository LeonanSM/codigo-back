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

import com.sistema.core.model.servico.Servico;
import com.sistema.core.model.servico.ServicoDTO;
import com.sistema.core.service.ServicoService;

@RestController
@RequestMapping("/servico")
public class ServicoController {

	@Autowired
	private ServicoService service;

	@GetMapping("/listar")
	public List<ServicoDTO> listar() {

		return service.listar();
	}

	@GetMapping("/buscar")
	public Servico buscar(@RequestParam Long id) {
		return service.buscar(id);
	}

	@PostMapping("/criar")
	public Servico criar(@RequestBody ServicoDTO dto) {

		return service.criar(dto);
	}

	@PutMapping("/alterar")
	public Servico alterar(@Valid @RequestBody ServicoDTO dto) {

		return service.alterar(dto);
	}

	@DeleteMapping("/excluir")
	public void excluir(@RequestParam Long id) {

		service.excluir(id);
	}

}
