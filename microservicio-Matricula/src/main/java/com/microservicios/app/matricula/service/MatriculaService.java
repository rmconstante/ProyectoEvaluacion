package com.microservicios.app.matricula.service;

import java.util.List;

import com.microservicio.commons.service.CommonService;

import com.microservicios.app.matricula.models.entity.Matricula;

public interface MatriculaService extends CommonService<Matricula> {
	
		public List<Matricula> findByNombreOrApellido(String term);
	

}
