package com.apt.sistemamatriculas.modelo;

import java.math.*;
import java.time.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int idMatricula;
	
	@Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	private LocalDate fecha;
	
	@Money
	@Min(value = 50)
	@Max(value = 100)
	private BigDecimal costo;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleEstudiante")
	private Estudiante estudiante;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleCarrera")
	private Carrera carrera;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleMateria")
	private Materia materia;
	
}
