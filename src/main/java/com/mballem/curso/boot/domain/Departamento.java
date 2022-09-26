package com.mballem.curso.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{

	@Column(name = "nome", nullable = false, unique = true, length = 60)//se a coluna tiver o mesmo nome do atributo o "name" é desnecessario. O nullabe = false indica que a coluna não pode ser nula
	private String nome;
	
	@OneToMany(mappedBy = "departamento")//mappedby necessario pois temos um relacionamento bidirecional entre cargos e departamentos. o lado forte é o lado que contem a chave estrangeira
	private List<Cargo> cargos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
