package com.sistema.core.model.ordemservico;

public enum StatusOrdem {

	ABERTA(1, "Aberta"), EM_EXECUCAO(2, "Em execução"), FINALIZADA(3, "Finalizada"), CANCELADA(4, "Cancelada"),
	FATURADA(5, "Faturado");

	private Integer id;
	private String descricao;

	StatusOrdem(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
