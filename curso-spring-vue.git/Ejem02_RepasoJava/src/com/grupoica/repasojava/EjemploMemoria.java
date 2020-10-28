package com.grupoica.repasojava;

import com.grupoica.repasojava.modelo.Usuario;

public class EjemploMemoria {
	public static void pruebaPasoPorValor() {
		int xx = 10;
		boolean y = true;
		String z ="Texto al declarar";
		 funcionCualquiera(xx,y,z);
		 System.out.println("XX = "+ xx +",Y = "+ y +"Z = "+ z);
	}
	// las variables primitivas (y string)
	private static void funcionCualquiera(int x, boolean y, String z) {
		
		System.out.println("X = "+ x +"Y = "+ y +"Z = "+ z);
		x=200;
		y = false;
		z ="texto nuevo de funcion";
		System.out.println("X = " + x +"Y = "  + y +" Z = "+ z);
	}
	public static void pruebaPasoPorReferencia() {
		Usuario alguien = new Usuario ("PEPITO",30);
		int array[] = new int [3];
		array [0] = 10; array [1] = 20 ;array [2] = 20;
		System.out.println("nombre =" + alguien.getNombre()
		+ ", Elemento 0 = "+ array [0]);
		
		int otroArray [] = array;
		otroArray[0] = 333;
		System.out.println("nombre =" + alguien.getNombre()
		+ ", Elemento 0 = "+ array [0]);
		
	}
	private static void otraFuncion(Usuario parUsu, int[] parArr) {
		
		System.out.println("nombre =" + parUsu.getNombre()+ ", Elemento 0 = "+ parArr[0]);
		
		parUsu.setNombre("Modif en funcion");
		parArr[0]= 9999;
		
		System.out.println("nombre =" + parUsu.getNombre() + ", Elemento 0 = "+ parArr[0]);

	}
}
