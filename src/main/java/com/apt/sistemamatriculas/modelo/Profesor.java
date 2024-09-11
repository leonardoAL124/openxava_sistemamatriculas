package com.apt.sistemamatriculas.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
@View(name = "vistaSimpleProfesor",
	  members = "idProfesor")
public class Profesor {
	
	public enum TipoRol {
		Maestro, Jefe_de_area
	};

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int idProfesor;
	
	@Embedded
	Usuario usuario;
	
	@Enumerated(EnumType.STRING)
	@Required
	private TipoRol rol;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleCarrera")
	private Carrera carrera;
	
}
