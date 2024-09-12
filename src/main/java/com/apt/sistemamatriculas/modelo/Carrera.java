package com.apt.sistemamatriculas.modelo;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
@View(name = "vistaSimpleCarrera",
	  members = "idCarrera, nombre, capacidadAlumnos")
public class Carrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int idCarrera;
	
	@Column(length = 45)
	@Size(min = 3, max = 45)
	@NotBlank
	@NotNull
	private String nombre;
	
	@TextArea
	@Size(min = 10, max = 100)
	private String descripcion;
	
	@Min(value = 20)
	@Max(value = 200)
	private int capacidadAlumnos;
	
}
