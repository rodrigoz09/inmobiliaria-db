package com.diseno.sistemas.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diseno.sistemas.model.Propiedad;

import com.diseno.sistemas.service.PropiedadService;



@RestController
@RequestMapping ("/api/propiedad/")
public class PropiedadController {
	
	@Autowired
	private PropiedadService propiedadService;
	
	@PostMapping
	private ResponseEntity<Propiedad> guardar (@RequestBody Propiedad propiedad){
		Propiedad temporal = propiedadService.create(propiedad);
		
		try {
			return ResponseEntity.created(new URI("/api/propiedad"+temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@GetMapping
	private ResponseEntity<List<Propiedad>> listarTodasLasPropiedades (){
		return ResponseEntity.ok(propiedadService.getAllPropiedades());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarPropiedad (@RequestBody Propiedad propiedad){
		propiedadService.delete(propiedad);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Propiedad>> listarPropiedadesPorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(propiedadService.findById(id));
	}
	

}

