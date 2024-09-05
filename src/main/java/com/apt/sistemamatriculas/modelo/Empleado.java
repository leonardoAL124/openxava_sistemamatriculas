package com.apt.sistemamatriculas.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
@View(name = "vistaSimpleEmpleado",
	  members = "idEmpleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int idEmpleado;
	
	@Embedded
	Usuario usuario;
	
}
