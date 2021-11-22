package com.diseno.sistemas.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "propiedad")
public class Propiedad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String telefono;
	private String ubicacion;
	private Integer cant_ambientes;
	private Integer antiguedad;
	private String amueblado;
	private String serv_adheridos;
	private String multimedia;
	private Boolean   disponibilidad;
	private String tipo;
	private Integer cod_propiedad;
	
	
	public Propiedad () {
		
	}
	
	public Propiedad(Long id, String telefono, String ubicacion, Integer cant_ambientes, Integer antiguedad,
			String amueblado, String serv_adheridos, String multimedia, Boolean disponibilidad, String tipo,
			Integer cod_propiedad) {
		
		this.id = id;
		this.telefono = telefono;
		this.ubicacion = ubicacion;
		this.cant_ambientes = cant_ambientes;
		this.antiguedad = antiguedad;
		this.amueblado = amueblado;
		this.serv_adheridos = serv_adheridos;
		this.multimedia = multimedia;
		this.disponibilidad = disponibilidad;
		this.tipo = tipo;
		this.cod_propiedad = cod_propiedad;
	}



	
	
	
	
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getTelefono() {
		return telefono;
	}




	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	public String getUbicacion() {
		return ubicacion;
	}




	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}




	public Integer getCant_ambientes() {
		return cant_ambientes;
	}




	public void setCant_ambientes(Integer cant_ambientes) {
		this.cant_ambientes = cant_ambientes;
	}




	public Integer getAntiguedad() {
		return antiguedad;
	}




	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}




	public String getAmueblado() {
		return amueblado;
	}




	public void setAmueblado(String amueblado) {
		this.amueblado = amueblado;
	}




	public String getServ_adheridos() {
		return serv_adheridos;
	}




	public void setServ_adheridos(String serv_adheridos) {
		this.serv_adheridos = serv_adheridos;
	}




	public String getMultimedia() {
		return multimedia;
	}




	public void setMultimedia(String multimedia) {
		this.multimedia = multimedia;
	}




	public Boolean getDisponibilidad() {
		return disponibilidad;
	}




	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}




	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	public Integer getCod_propiedad() {
		return cod_propiedad;
	}




	public void setCod_propiedad(Integer cod_propiedad) {
		this.cod_propiedad = cod_propiedad;
	}




	
	
	
	
	
	
}