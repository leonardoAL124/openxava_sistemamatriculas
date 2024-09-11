package com.apt.sistemamatriculas.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Horario {

	public enum Jornada {
		Matutina, Vespertina, Nocturna
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int idHorario;
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	@Enumerated(EnumType.STRING)
	@Required
	private Jornada jornada;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleCarrera")
	private Carrera carrera;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleMateria")
	private Materia materia;
	
}
