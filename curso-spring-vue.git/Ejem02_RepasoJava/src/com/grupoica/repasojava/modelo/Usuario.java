package com.grupoica.repasojava.modelo;

public class Usuario  extends Object{
/**
 * tipica clase Pojo, q solo tiene geter y seter con poca funcionalidad
 * 
 */
	private String nombre;
	private int edad;
	
	public Usuario() {
		super();
		nombre= "Sin nombre";
	}
	
	public Usuario(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Usuario usuario = (Usuario) obj;
		return this.nombre == usuario.nombre
				&& this.edad  == usuario.edad;
	}
	//@Override
	public boolean equals(Usuario usuario) {
		// TODO Auto-generated method stub
		return this.nombre == usuario.nombre
				&& this.edad  == usuario.edad;
	}


	@Override// sobreescribir(Machacar el metodo padre)
			// 2 meotodos o  constructores con mis nombre pero con parametros distintos
	public String toString() {
		// TODO Auto-generated method stub
		return "Usuario "+ nombre + "["+ edad +"]";
		
		
	}
	
}
