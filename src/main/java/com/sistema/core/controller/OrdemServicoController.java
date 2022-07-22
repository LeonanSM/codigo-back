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

import com.sistema.core.model.ordemservico.OrdemServico;
import com.sistema.core.model.ordemservico.OrdemServicoDTO;
import com.sistema.core.service.OrdemServicoService;

@RestController
@RequestMapping("/ordemservico")
public class OrdemServicoController {

	@Autowired
	private OrdemServicoService service;

	@GetMapping("/listar")
	public List<OrdemServicoDTO> listar() {

		return service.listar();
	}

	@GetMapping("/buscar")
	public OrdemServico buscar(@RequestParam Long id) {
		return service.buscar(id);
	}

	@PostMapping("/criar")
	public OrdemServico criar(@Valid @RequestBody OrdemServicoDTO dto) {

		return service.criar(dto);
	}

	@PutMapping("/alterar")
	public OrdemServico alterar(@Valid @RequestBody OrdemServicoDTO dto) {

		return service.alterar(dto);
	}

	@DeleteMapping("/excluir")
	public void excluir(@RequestParam Long id) {

		service.excluir(id);
	}
}
