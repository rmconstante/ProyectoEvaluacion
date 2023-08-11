package com.microservicios.app.matricula.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservicio.commons.service.CommonServiceImpl;
import com.microservicios.app.matricula.models.entity.Matricula;
import com.microservicios.app.matricula.models.repository.MatriculaRepository;

@Service
public class MatriculaServiceImpl extends CommonServiceImpl<Matricula,MatriculaRepository> implements MatriculaService{
	
	@Override
	public List<Matricula> findByNombreOrApellido(String term){
		return repository.findByNombreOrApellido(term);
	
}
	
}
