package br.gov.sp.fatec.repository;

import org.springframework.data.repository.CrudRepository;
import br.gov.sp.fatec.model.Dependente;

public interface DependenteRepository extends CrudRepository<Dependente, Long>{

	public Dependente findByNome(String nome);

}