package com.grupoica.repasojava;

import java.util.HashMap;
import java.util.Scanner;

import com.grupoica.repasojava.modelo.Usuario;

public class EjemploHashMap {
	static HashMap<String, Usuario> diccUsuarios;
	
	public static void probandoHasMap() {
		diccUsuarios = new HashMap<>();
		diccUsuarios.put("Luis", new Usuario ("Luis", 18)); 
		diccUsuarios.put("Ana", new Usuario ("Ana", 20)); 
		diccUsuarios.put("Luisa", new Usuario ("Luisa", 30)); 
		Scanner escaner = new Scanner (System.in);
		System.out.println("Introduzca el usuario");
		//String nombre = escaner.nextLine();
		//System.out.println("El usuario " +  diccUsuarios.get(nombre).toString());
		
		
	}

}
