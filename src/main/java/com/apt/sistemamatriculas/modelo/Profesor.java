package com.apt.sistemamatriculas.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
@View(name = "vistaSimpleProfesor",
	  members = "idProfesor, foto")
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int idProfesor;
	
	@Embedded
	Usuario usuario;
	
	@File
	private String foto;
}
