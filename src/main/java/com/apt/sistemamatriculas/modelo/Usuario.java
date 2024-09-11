package com.apt.sistemamatriculas.modelo;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class Usuario {
	
	@Column(length = 25)
	private String nombre;
	
	@Column(length = 25)
	private String apellido;
	
	@Column(length = 10)
	private String cedula;
	
	@Column(length = 10)
	private String telefono;
	
	@Column(length = 45)
	@Email
	private String correo;
	
	@Column(length = 45)
	private String direccion;

	@File
	private String foto;
	
}
