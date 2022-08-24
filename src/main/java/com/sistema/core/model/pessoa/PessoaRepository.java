package com.sistema.core.model.pessoa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sistema.core.model.pessoa.dto.PessoaDTOList;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	@Query(value = "select * from pessoa p where nome=:nome", nativeQuery = true)
	Optional<Pessoa> pesquisaExataNome(String nome);

	Optional<Pessoa> findByNome(String nome);

	Optional<Pessoa> findByNomeAndEmail(String nome, String email);

	List<Pessoa> findByNomeContaining(String nome);

	@Query(value = "select nome,email,cpfcnpj as documento from pessoa p where nome=:nome", nativeQuery = true)
	List<PessoaDTOList> pesquisaPorNomeProjecao(String nome);

	//https://www.baeldung.com/spring-data-derived-queries
}
