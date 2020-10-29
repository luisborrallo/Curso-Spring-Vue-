package com.grupoica.repasojava.interfaces;

public class Perro implements Animal{
	boolean cola;
	public Perro(boolean cola) {
		super();
		this.cola = cola;
	}

	public boolean isCola() {
		return cola;
	}

	public void setCola(boolean cola) {
		this.cola = cola;
	}

	@Override
	public void alimentarse(String comida) {
		System.out.println("El perro se come  " + comida);
		
	}
	
	
}



