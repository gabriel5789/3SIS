package com.fiap.produto.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Produto {

	@Id
	@SequenceGenerator(name = "produtoSequence", initialValue = 1, allocationSize = 1, sequenceName = "sq_produto_id")
	@GeneratedValue(generator = "produtoSequence", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	
	private String nome;
	
	@Column(nullable = true)
	private String descricao;
	
	@Column(precision = 2)
	private BigDecimal valor;
	
	@Column(length = 8, unique = true)
	private String codigo;
	
	private Integer quantidade;
	
	private Integer status;
	
	public Produto(Long id, String nome, String descricao, BigDecimal valor, String codigo, Integer quantidade,
			Integer status) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.status = status;
	}
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
