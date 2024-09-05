package com.apt.sistemamatriculas.modelo;

import java.math.*;
import java.time.*;

import javax.persistence.*;

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
	private BigDecimal precio;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleEstudiante")
	private Estudiante estudiante;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleEmpleado")
	private Empleado empleado;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaSimpleCarrera")
	private Carrera carrera;
	
}
