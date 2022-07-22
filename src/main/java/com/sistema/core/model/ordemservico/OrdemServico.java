package com.sistema.core.model.ordemservico;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sistema.core.model.ordemservicoitem.OrdemServicoItem;
import com.sistema.core.model.pessoa.Pessoa;

@Entity
@Table(name = "ordemservico")
public class OrdemServico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "descricaoservico")
	private String descricaoServico;

	@Column(name = "valorbruto")
	private BigDecimal valorBruto;

	@Column(name = "valorliquido")
	private BigDecimal valorLiquido;

	@Column(name = "valordesconto")
	private BigDecimal valorDesconto;

	@Column(name = "percentualdesconto")
	private Double percentualDesconto;
	
	private StatusOrdem status;

	private LocalDateTime data;

	private LocalDateTime inicio;

	private LocalDateTime fim;



	@ManyToOne(fetch = FetchType.EAGER)
	private Pessoa pessoa;

	@OneToMany(mappedBy = "ordemServico",cascade = CascadeType.PERSIST)
	private List<OrdemServicoItem> ordemServicoItem = new List<OrdemServicoItem>() {
		
		@Override
		public <T> T[] toArray(T[] a) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<OrdemServicoItem> subList(int fromIndex, int toIndex) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public OrdemServicoItem set(int index, OrdemServicoItem element) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean retainAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public OrdemServicoItem remove(int index) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public ListIterator<OrdemServicoItem> listIterator(int index) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ListIterator<OrdemServicoItem> listIterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int lastIndexOf(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Iterator<OrdemServicoItem> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public int indexOf(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public OrdemServicoItem get(int index) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean containsAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean addAll(int index, Collection<? extends OrdemServicoItem> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean addAll(Collection<? extends OrdemServicoItem> c) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void add(int index, OrdemServicoItem element) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean add(OrdemServicoItem e) {
			// TODO Auto-generated method stub
			return false;
		}
	};

public OrdemServico() {
	// TODO Auto-generated constructor stub
}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}

	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}

	public BigDecimal getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}

	public BigDecimal getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(BigDecimal valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Double getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(Double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}



	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	
	public List<OrdemServicoItem> getOrdemServicoItem() {
		return ordemServicoItem;
	}

	public void setOrdemServicoItem(List<OrdemServicoItem> ordemServicoItem) {
		this.ordemServicoItem = ordemServicoItem;
	}

	public StatusOrdem getStatus() {
		return status;
	}

	public void setStatus(StatusOrdem status) {
		this.status = status;
	}



}
