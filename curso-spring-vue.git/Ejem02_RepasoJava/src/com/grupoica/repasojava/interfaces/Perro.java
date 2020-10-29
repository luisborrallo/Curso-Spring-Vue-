package com.grupoica.repasojava.interfaces;

public class Perro implements Animal{
	boolean ladrido;
	
	public Perro(boolean ladrido) {
		super();
		this.ladrido = ladrido;
	}

	public boolean isladrido() {
		return ladrido;
	}

	public void setladrido(boolean ladrido) {
		this.ladrido = ladrido;
	}

	@Override
	public void alimentarse(String comida) {
		System.out.println("El perro se come  " + comida);
		
	}
	
	
}



