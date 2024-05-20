package com.locadora.locacao.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Carro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Campo nome é Obrigatorio")
	private String descricao;
	
	@NotBlank(message = "Campo Cor é Obrigatorio")
	private String cor;
	
	@NotBlank(message = "Campo Ano Fabricação é Obrigatorio")
	private Integer anoFabricacao;
	
	@NotBlank(message = "Campo Fabricante é Obrigatorio")
	private String fabricante;
	
	@NotBlank(message = "Campo Modelo é Obrigatorio")
	private String modelo;

	public Carro() {
		super();
	}

	public Carro(Long id, String descricao, String cor, Integer anoFabricacao, String fabricante, String modelo) {
		this.id = id;
		this.descricao = descricao;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
