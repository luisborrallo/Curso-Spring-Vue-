package com.grupoica.repasojava.modelo;

import java.util.ArrayList;

/* Clase que se encará de las operaciones C.R.U.D.
 * Create Read Update Delete (Op. Alta, baja, modificación y consulta)
 * */ 

public class GestionUsuarios {
	
	// lista en su forma ambigua (todos los elementos son object)	
	// private ArrayList listaUsuarios;	es lo mismo ArrayList<Object>
	// lista es su forma genérica 
	// (todos lso elemenos son del mismo o de algún tipo heredero)
	private ArrayList<Usuario> listaUsuariosU;

	public GestionUsuarios() {
		super();
		this.listaUsuariosU = new ArrayList<Usuario>();

	}

	public void listarUsuarios() {
		for (int i = 0; i < listaUsuariosU.size(); i++) {
			System.out.println(listaUsuariosU.get(i).toString());

		}
	}

	public void anadirUsu(Usuario usu) {
		this.listaUsuariosU.add(usu);
	}

	public void mostrarUsuarioNombre(String nombre) {

		double doble = 10.43434;
		int entero = (int) doble;
		for (Usuario usu : listaUsuariosU) {
			if (usu.getNombre().equals(nombre)) {
				System.out.println("Nombre: " + usu.getNombre());
			}
		}

	}

	public void modificarUsuarioEdadYNombre(int edad, String nombre, String nombreBusqueda) {

		for (Usuario usu : listaUsuariosU) {
			if (usu.getNombre().equals(nombreBusqueda)) {
				usu.setEdad(edad);
				usu.setNombre(nombre);
			}
		}
	}

	public void modifUsuarioEdad(int edad, String nombreBusqueda) {

		for (Usuario usu : listaUsuariosU) {
			if (usu.getNombre().equals(nombreBusqueda)) {
				usu.setEdad(edad);
			}
		}
	}

	public void modifUsuarioNombre(String nombre, String nombreBusqueda) {

		for (Usuario usu : listaUsuariosU) {
			if (usu.getNombre().equals(nombreBusqueda)) {
				usu.setNombre(nombre);
			}
		}
	}

	public void filtroEdadUnica(int edad) {
		for (Usuario usu : listaUsuariosU) {
			if(usu.getEdad()==edad) {
				System.out.println(usu.toString());
			}
		}
	}
	
	public void RangoEdad(int edadMinima, int edadMaxima) {
		for (Usuario usu : listaUsuariosU) {
			if(usu.getEdad()>=edadMinima && usu.getEdad()<=edadMaxima) {
				System.out.println(usu.toString());
			}
		}
	}
	
	
	public void eliminarUsuarios() {

		listaUsuariosU.clear();

	}

}
