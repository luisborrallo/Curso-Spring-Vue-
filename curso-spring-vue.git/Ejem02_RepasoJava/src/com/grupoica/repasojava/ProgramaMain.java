package com.grupoica.repasojava;

import com.grupoica.repasojava.modelo.GestionUsuarios;

public class ProgramaMain {

	/** P.O.O.
	 * La unidad básica de almacenamiento son los tipos primitivos y los objetos
	 * que están basados en clases. Las clases son el molde, plantilla o estructura que indica 
	 * como serán todos los objetos instancados a partir de ella:
	 *  Sus variables miembros(campos, atributos, propiedades...) y sus métodos (funciones propias).
	 *  -Encapsulacion:  capacidad de las clases para  limitar  el acceso a las a variables miembro y 
	 *  metodos (private, public, protected o por herencia)
	 *  -Herencia
	 *  -Polimorfismo
	 */
	
	public static void main(String[] args) {
		
		GestionUsuarios gesUsu = new GestionUsuarios();
		/*gesUsu.add("asdsadasd");
		gesUsu.listarUsuarios();*/
		
		
		EjemploMemoria.pruebaPasoPorValor();
		
		EjemploMemoria.pruebaPasoPorReferencia();
		

	}

}
