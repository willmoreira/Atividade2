package br.gov.sp.fatec.repository;

import org.springframework.data.repository.CrudRepository;

import br.gov.sp.fatec.model.Funcionario;

public interface FuncionarioRepository extends CrudRepository <Funcionario, Long>{
	
	public Funcionario findByNome(String nome);


}
