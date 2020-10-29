package com.grupoica.repasojava.interfaces;

import java.util.ArrayList;

public class ProbandoVehiculos {
	public static void probar() {
		Coche miCoche = new Coche("Kia",1500, 60.34f);
		
		Coche miCocheFines = new Coche("Hammer",3500, 63.34f);
		
		Caballo miCaballo = new Caballo("Rocinante",1500, 60);
		
		Patinete miPatinete = new Patinete("Bmw",150, 1000);
		
		Vehiculo unVehiculo = miCoche;
		//unVehiculo.aceleracion();
		
		ArrayList<Motorizable> garaje = new ArrayList<>();
		//garaje.add(miCaballo);
		garaje.add(miCoche);
		garaje.add(miCocheFines);
		garaje.add(miPatinete);
		//garaje.add(new Vehiculo("No comprado",3));
		
		System.out.println("Mi garaje:");
		for (Motorizable vehiculo: garaje) {
			vehiculo.encender();
			
		}
	}
}

	/* Ejercicios: 
	 * 1 - Garaje ser solo para objetos motorizables
	 * 2 - Crear clase Patinete que sea motorizable, pero no vehiculo
	 * 3 - Guarderemos un patinete en el garaje 
	 * */



