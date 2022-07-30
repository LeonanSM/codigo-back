package com.sistema.core.model.ordemservico;

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

import com.sistema.core.model.ordemservico.dto.OrdemServicoChangeDTO;
import com.sistema.core.model.ordemservico.dto.OrdemServicoCreateDTO;
import com.sistema.core.model.ordemservico.dto.OrdemServicoListDTO;
import com.sistema.core.model.ordemservico.dto.OrdemServicoShowDTO;

@RestController
@RequestMapping("/ordemservico")
public class OrdemServicoController {

	@Autowired
	private OrdemServicoService service;

	@GetMapping("/listar")
	public List<OrdemServicoListDTO> listar() {

		return service.listar();
	}

	@GetMapping("/buscar")
	public OrdemServicoShowDTO buscar(@RequestParam Long id) {
		return service.buscarPorId(id);
	}

	@PostMapping("/criar")
	public OrdemServicoShowDTO criar(@Valid @RequestBody OrdemServicoCreateDTO dto) {

		return service.criar(dto);
	}

	@PutMapping("/alterar")
	public OrdemServicoShowDTO alterar(@Valid @RequestBody OrdemServicoChangeDTO dto) {

		return service.alterar(dto);
	}

	@DeleteMapping("/excluir")
	public void excluir(@RequestParam Long id) {

		service.excluir(id);
	}
}
