package com.microservicios.app.matricula.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservicio.commons.controller.CommonController;

import com.microservicios.app.matricula.models.entity.Matricula;

import com.microservicios.app.matricula.service.MatriculaService;


public class MatriculaController  extends CommonController<Matricula,MatriculaService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Matricula matricula, @PathVariable Long id){
		Optional<Matricula> o = service.findById(id);
		if (o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Matricula matriculaDB = o.get();
		matriculaDB.setNombre(matricula.getNombre());
		matriculaDB.setApellido(matricula.getApellido());
		matriculaDB.setEdad(matricula.getEdad());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(matriculaDB));
				}
	
	@GetMapping("/filtrar/{term}")
	public ResponseEntity<?> filtrar(@PathVariable String term){
		return ResponseEntity.ok(service.findByNombreOrApellido(term));
	}
}
