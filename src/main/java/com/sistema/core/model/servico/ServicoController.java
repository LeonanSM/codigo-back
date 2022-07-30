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

import com.sistema.core.model.servico.dto.ServicoChangeDTO;
import com.sistema.core.model.servico.dto.ServicoCreateDTO;
import com.sistema.core.model.servico.dto.ServicoListDTO;
import com.sistema.core.model.servico.dto.ServicoShowDTO;





@RestController
@RequestMapping("/servico")
public class ServicoController {

	@Autowired
	private ServicoService service;

	@GetMapping("/listar")
	public List<ServicoListDTO> listar() {

		return service.listar();
	}

	@GetMapping("/buscar")
	public ServicoShowDTO buscar(@RequestParam Long id) {
		return service.buscarPorId(id);
	}

	@PostMapping("/criar")
	public ServicoShowDTO criar(@RequestBody ServicoCreateDTO dto) {

		return service.criar(dto);
	}

	@PutMapping("/alterar")
	public Servico alterar(@Valid @RequestBody ServicoChangeDTO dto) {

		return service.alterar(dto);
	}

	@DeleteMapping("/excluir")
	public void excluir(@RequestParam Long id) {

		service.excluir(id);
	}

}
