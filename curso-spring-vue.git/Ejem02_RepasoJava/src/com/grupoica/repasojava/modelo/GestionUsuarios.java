package com.grupoica.repasojava.modelo;

import java.util.ArrayList;

/**clase que se encargará de las operacion C.R.U.D
 * Create Read Update Delete
 */
public class GestionUsuarios {
	
	private ArrayList listaUsuarios;

	public GestionUsuarios() {
		super();
		this.listaUsuarios = new ArrayList<>();
		this.listaUsuarios.add(10);
		Usuario usu = new Usuario();
		usu.setEdad(30);
		usu.setNombre("Benganito");
		System.out.println("Nombre: "+ usu.getNombre());
		System.out.println("Edad: "+ usu.getEdad());
		this.listaUsuarios.add(usu);
		
		Usuario u2 = new Usuario ("U2" , 50);
		System.out.println("Edad u2: "+ u2.getEdad());
		
		this.listaUsuarios.add("texto");
		this.listaUsuarios.add(new Object());
		this.listarUsuarios();	
		
		
		Loco joker = new Loco();
		joker.setNombre("JoKer");
		System.out.println("joker :" + joker.toString());
		
		
		
		
	
	}

	
	public void listarUsuarios() {
		
		for (int i = 0; i<this.listaUsuarios.size(); i++) {
			System.out.println(this.listaUsuarios.get(i));
		}	
	}
	public  void add(Object obj) {
		this.listaUsuarios.add(obj);
	}
	
}
