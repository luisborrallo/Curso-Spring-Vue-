package com.grupoica.repasojava.modelo;

import com.grupoica.repasojava.modelo.Usuario;

public class Usuario {

	private int edad;
	private String nombre;

	public Usuario() {
		this.edad = 0;
		this.nombre = "Hola ";
	}

	public Usuario(String nombre, int edad) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "edad=" + edad + ", nombre=" + nombre;
	}

	


	@Override
	public boolean equals(Object obj) {
		Usuario user = (Usuario) obj;
		return this.nombre.equals(user.nombre)&& this.edad==user.edad;
	}

	public boolean equal(Usuario user) {
		return(this.nombre.equals(user.nombre)&& this.edad==user.edad);
		
	}

}

