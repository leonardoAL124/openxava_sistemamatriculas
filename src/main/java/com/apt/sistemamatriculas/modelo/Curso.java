package com.apt.sistemamatriculas.modelo;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int idCurso;
	
	@Min(value = 1)
	@Max(value = 10)
	private int curso;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleProfesor")
	private Profesor profesor;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleMateria")
	private Materia materia;
	
}
