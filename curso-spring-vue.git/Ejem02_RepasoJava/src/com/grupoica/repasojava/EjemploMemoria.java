package com.grupoica.repasojava;

import com.grupoica.repasojava.modelo.Usuario;

public class EjemploMemoria {

	public static void pruebaPasoPorValor() {
		
		int xx = 10; 
		boolean y = true; 
		String z = "Texto al declarar";
		funcionCualquiera(xx, y, z);
		System.out.println("XX = " + xx + ", Y = " + y + ", Z = " + z);
	}
	// Las variables primitivas (y String) se pasan por valor
	// se crean copias de las variables
	private static void funcionCualquiera(int x, boolean y, String z) {
		
		System.out.println("X = " + x + ", Y = " + y + ", Z = " + z);
		x = 200;
		y = false;
		z = "Texto nuevo dentro de función";
		System.out.println("X = " + x + ", Y = " + y + ", Z = " + z);
	}
	

	public static void pruebaPasoPorReferencia() {
		// Declaración variable: Reservamos un espacio pequeño sólo para
		// la dirección de memoria, es decir, entre 4 y 8 bytes
		// En realidad sólo declaramos una referencia a un objeto ¿Que valor tiene?
		Usuario alguien = null;	// Dirección 0, a ninguna parte
		// instanciación del objeto y asignación a la variable
		// Instanciación: Reserva de memoria para todos los campos (4 + 8 bytes = 12 bytes)
		// Llamada al constructor: Se reveservan otro 20 bytes (12 + 20 = 32 bytes)
		// Asignación coge la dirección de memoria que devuelve new y la pone en alguien
		alguien = new Usuario("Pepito el del Quinto", 30);
		int array[] = new int[3];
		array[0] = 10; array[1] = 20; array[2] = 30;
		otraFuncion(alguien, array);
		System.out.println("nombre = " + alguien.getNombre() 
			+ ", Elemento 0 = " + array[0]);
		
		int otroArray[] = array;
		otroArray[0] = 333;
		System.out.println("nombre = " + alguien.getNombre() 
		+ ", Elemento 0 = " + array[0]);
	}
	// Esta función sólo recibe, 8 bytes por cada parámetro con la referencia
	private static void otraFuncion(Usuario parUsu, int[] parArr) {

		System.out.println("nombre = " + parUsu.getNombre() 
			+ ", Elemento 0 = " + parArr[0]);
		
		parUsu.setNombre("Modif en funcion");
		parArr[0] = 9999;
		
		System.out.println("nombre = " + parUsu.getNombre() 
		+ ", Elemento 0 = " + parArr[0]);
	}
	
}
