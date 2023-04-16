package com.example.baseproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import lombok.Data;

@Entity
@Data
@Table(name = "Editais")

public class Edital {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; //não tenho certeza se é utilizável para id mas pode ser bom para a tabela
	private String titulo, descricao, criterios,requisitos;
	private int prazo;


	@JoinColumn(name = "notice")
	private Edital edital;
	public Edital(String titulo, String descricao, int prazo, String criterios, String requisitos, Edital edital)
	{
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.prazo = prazo;
		this.criterios = criterios;
		this.requisitos = requisitos;
		this.edital = edital;

	}
	
	public Edital getEdital(){
		return edital;
	}

	public void setEdital(Edital edital){
		this.edital = edital;
	}

	public String getTitulo(){
		return titulo;
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getDescricao(){
		return descricao;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public String getCriterios(){
		return criterios;
	}

	public void setCriterios(String criterios){
		this.criterios = criterios;
	}

	public String getRequisitos(){
		return requisitos;
	}

	public void setRequisitos(String requisitos ){
		this.requisitos = requisitos;
	}

	public int getPrazo(){
		return prazo;
	}

	public void setPrazo(int prazo){
		this.prazo = prazo;
	}

	

}
