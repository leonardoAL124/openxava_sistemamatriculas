package com.apt.sistemamatriculas.modelo;

import javax.persistence.*;

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
	private String nombre;
	
	@TextArea
	private String descripcion;
	
}
