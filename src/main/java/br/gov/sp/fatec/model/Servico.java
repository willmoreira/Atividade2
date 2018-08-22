package br.gov.sp.fatec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "servico")
public class Servico {

	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "serv_id", unique=true, length = 5, nullable = false)
	private Long id;
	
    @Column(name = "serv_nome", unique=true, length = 50, nullable = false)
	private String nome;
	

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
}
