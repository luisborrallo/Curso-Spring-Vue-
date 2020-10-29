package com.grupoica.repasojava.interfaces;

import java.util.ArrayList;

public class ProbandoVehiculos {
	public static void probar() {
		Coche miCoche = new Coche("Kia",1500, 60.34f);
		
		Coche miCocheFines = new Coche("Hammer",3500, 63.34f);
		
		Patinete miPatinete = new Patinete(100);
		
		Vehiculo unVehiculo = miCoche;
		//unVehiculo.aceleracion();
		
		ArrayList<Motorizable> garaje = new ArrayList<>();
		//garaje.add(miCaballo);
		garaje.add(miCoche);
		garaje.add(miCocheFines);
		garaje.add(miPatinete);
		//garaje.add(new Vehiculo("No comprado",3));
		
		System.out.println("En mi garaje hay:");
		for (Motorizable vehiculo: garaje) {
			vehiculo.encender();
		}
		
		ArrayList<Animal> granja = new ArrayList<>();
		granja.add(new Caballo("messi",1500, 60));
		granja.add(new Perro(true));
		System.out.println("en mi  granja hay:");
		
		for (Animal animal: granja) {
			animal.alimentarse("Zanahoria");
		}
	}

}

	/* Ejercicios: 
	 * 1 - Garaje ser solo para objetos motorizables
	 * 2 - Crear clase Patinete que sea motorizable, pero no vehiculo
	 * 3 - Guarderemos un patinete en el garaje 
	 * 4 - Hacer una clase Perro (que tampoco es un vehículo)
	 * 5 - Crear una interfaz Animal con metodo alimentarse(String comida)
	 * 6 - Perro y Caballo que sean animales, y hacer una granja y alimentarlos.
	 * */



