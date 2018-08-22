package br.gov.sp.fatec.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario {

	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "func_id", unique=true, length = 5, nullable = false)
	private Long id;
		
    @Column(name = "func_nome", length = 50, nullable = false)
	private String nome;
	
    @Column(name = "func_cpf", unique=true, length = 11, nullable = false)
	private int cpf;
	
    @Column(name = "func_servico", length = 50, nullable = false)
	private String nomeServico;
	
    @OneToMany
    @JoinColumn(name = "depen_id")	
	private List<Dependente> dependentes;
	

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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	
	public String getNomeServico() {
		return nomeServico;
	}
	
	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
}
	
