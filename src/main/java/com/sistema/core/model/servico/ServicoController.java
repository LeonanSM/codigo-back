package com.sistema.core.model.servico;

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

import com.sistema.core.model.servico.dto.ServicoDTOChange;
import com.sistema.core.model.servico.dto.ServicoDTOCreate;
import com.sistema.core.model.servico.dto.ServicoDTOList;
import com.sistema.core.model.servico.dto.ServicoDTOShow;





@RestController
@RequestMapping("/servico")
public class ServicoController {

	@Autowired
	private ServicoService service;

	@GetMapping("/listar")
	public List<ServicoDTOList> listar() {

		return service.listar();
	}

	@GetMapping("/buscar")
	public ServicoDTOShow buscar(@RequestParam Long id) {
		return service.buscarPorId(id);
	}

	@PostMapping("/criar")
	public ServicoDTOShow criar(@RequestBody ServicoDTOCreate dto) {

		return service.criar(dto);
	}

	@PutMapping("/alterar")
	public Servico alterar(@Valid @RequestBody ServicoDTOChange dto) {

		return service.alterar(dto);
	}

	@DeleteMapping("/excluir")
	public void excluir(@RequestParam Long id) {

		service.excluir(id);
	}

}
