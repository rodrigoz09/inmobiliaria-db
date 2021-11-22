package com.diseno.sistemas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diseno.sistemas.model.Propiedad;

import com.diseno.sistemas.repository.PropiedadRepository;



@Service
public class PropiedadService {
	
	@Autowired
	private PropiedadRepository propiedadRepository;
	
	
	public Propiedad create (Propiedad propiedad) {
		return propiedadRepository.save(propiedad);
	}
	
	public List<Propiedad> getAllPropiedades (){
		return propiedadRepository.findAll();
	}
	
	public void delete (Propiedad propiedad) {
		propiedadRepository.delete(propiedad);
	}
	
	public Optional<Propiedad> findById (Long id) {
		return propiedadRepository.findById(id);
	}
	

}