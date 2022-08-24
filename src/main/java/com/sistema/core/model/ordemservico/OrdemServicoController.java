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

import com.sistema.core.model.ordemservico.dto.OrdemServicoDTOChange;
import com.sistema.core.model.ordemservico.dto.OrdemServicoDTOCreate;
import com.sistema.core.model.ordemservico.dto.OrdemServicoDTOList;
import com.sistema.core.model.ordemservico.dto.OrdemServicoDTOShow;

@RestController
@RequestMapping("/ordemservico")
public class OrdemServicoController {

	@Autowired
	private OrdemServicoService service;

	@GetMapping("/listar")
	public List<OrdemServicoDTOList> listar() {

		return service.listar();
	}

	@GetMapping("/buscar")
	public OrdemServicoDTOShow buscar(@RequestParam Long id) {
		return service.buscarPorId(id);
	}

	@PostMapping("/criar")
	public OrdemServicoDTOShow criar(@Valid @RequestBody OrdemServicoDTOCreate dto) {

		return service.criar(dto);
	}

	@PutMapping("/alterar")
	public OrdemServicoDTOShow alterar(@Valid @RequestBody OrdemServicoDTOChange dto) {

		return service.alterar(dto);
	}

	@DeleteMapping("/excluir")
	public void excluir(@RequestParam Long id) {

		service.excluir(id);
	}
}
