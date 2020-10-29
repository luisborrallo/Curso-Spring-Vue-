package com.grupoica.repasojava;


import com.grupoica.repasojava.interfaces.ProbandoVehiculos;
import com.grupoica.repasojava.modelo.GestionUsuarios;
import com.grupoica.repasojava.modelo.Loco;
import com.grupoica.repasojava.modelo.Usuario;


public class ProgramaMain {

	public static void main(String[] args) {
		/**
		 * //EjemploHashMap.probandoHasMap();

		// Ejercicios:
		// 1 -  Traer los ejemplos del constructor GestionUsuarios a main
		// 2 - Modificar usuario (metodo para cambiar edad, nombre, loco ....)
		// 3 - Método eliminar todos los usuarios
		// 4 - Filtrar usuarios por edad (motrar todos los que tengan cierta edad)
		// 5 - Filtrar usuarios por edad (los que estén en un rango de edad)
		
		GestionUsuarios gestion = new GestionUsuarios();
		gestion.anadirUsu(new Usuario("PEPE", 30));
		gestion.anadirUsu(new Usuario("BRUCE",39));
		Loco loco = new Loco(true, "LUIS",64);
		gestion.anadirUsu(loco);
		gestion.filtroEdadUnica(30);
		gestion.RangoEdad(30, 40);
		gestion.modifUsuarioEdad(30, "Joker");
		gestion.modifUsuarioNombre("BRUCE", "Joker");
		gestion.listarUsuarios();
		gestion.eliminarUsuarios();
		gestion.listarUsuarios();

		**/
		ProbandoVehiculos.probar();
		

	}
	
}
