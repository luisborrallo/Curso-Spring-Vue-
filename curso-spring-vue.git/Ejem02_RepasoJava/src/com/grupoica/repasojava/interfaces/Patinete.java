package com.grupoica.repasojava.interfaces;

public class Patinete  implements Motorizable {

	private int bateria;
	
	public Patinete( int bateria) {
		this.bateria = bateria;
	}






	@Override
	public void encender() {
		System.out.println("Enciendes el patinete");
		
	}



}

	

