package com.apt.sistemamatriculas.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con OpenXava Studio/Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class sistemamatriculas {

	public static void main(String[] args) throws Exception {
		//DBServer.start("sistemamatriculas-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("sistemamatriculas"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
