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
	@Size(min = 3, max = 25)
	@NotBlank
	@NotNull
	private String nombre;
	
	@Column(length = 25)
	@Size(min = 3, max = 25)
	@NotBlank
	@NotNull
	private String apellido;
	
	@Column(length = 10)
	@Size(min = 10, max = 10)
	@NotBlank
	@NotNull
	private String cedula;
	
	@Column(length = 10)
	@Size(min = 10, max = 10)
	@NotBlank
	@NotNull
	private String telefono;
	
	@Column(length = 45)
	@Email(message = "Ingrese un email valido")
	@NotBlank
	@NotNull
	private String correo;
	
	@Column(length = 45)
	@Size(min = 10, max = 45)
	private String direccion;

	@File
	private String foto;
	
}
