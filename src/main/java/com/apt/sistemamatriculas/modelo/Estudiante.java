package com.apt.sistemamatriculas.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
@View(name = "vistaSimpleEstudiante",
	  members = "idEstudiante, foto")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int idEstudiante;
	
	@Embedded
	Usuario usuario;
	
	@File
	private String foto;

}
