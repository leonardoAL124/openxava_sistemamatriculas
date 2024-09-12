package com.apt.sistemamatriculas.modelo;

import java.time.*;

import javax.persistence.*;
import javax.validation.constraints.*;

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
	
	@Stereotype("Date")
	@NotNull
	private LocalDate fechaInicio;
	
	@Stereotype("Date")
	@NotNull
	private LocalDate fechaFin;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	@Required
	private Jornada jornada;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleCarrera")
	private Carrera carrera;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleMateria")
	private Materia materia;
	
}
