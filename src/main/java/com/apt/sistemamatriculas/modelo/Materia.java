package com.apt.sistemamatriculas.modelo;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
@View(name = "vistaSimpleMateria", members = "idMateria, nombre")
public class Materia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int idMateria;
	
	@Column(length = 45)
	@Size(min = 10, max = 45)
	private String nombre;
	
	@TextArea
	@Size(min = 10, max = 70)
	private String descripcion;
	
}
