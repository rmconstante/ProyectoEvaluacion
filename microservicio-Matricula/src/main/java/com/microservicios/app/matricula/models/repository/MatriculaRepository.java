package com.microservicios.app.matricula.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.microservicios.app.matricula.models.entity.Matricula;


public interface MatriculaRepository extends CrudRepository<Matricula, Long>  {
	
	@Query("select a from Matriculas a where a.nombre like %?1% or a.apellido like %?1%" )
	public List<Matricula> findByNombreOrApellido(String term);


}
