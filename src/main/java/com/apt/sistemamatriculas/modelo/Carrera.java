package com.apt.sistemamatriculas.modelo;

import javax.persistence.*;

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
	private String nombre;
	
	@TextArea
	private String descripcion;
	
	private int capacidadAlumnos;
	
}
