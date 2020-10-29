package com.grupoica.repasojava.interfaces;

public class Patinete extends Vehiculo implements Motorizable {

	private int bateria;
	
	public Patinete(String marca, float peso, int bateria) {
		super(marca, peso);
		this.bateria = bateria;
		
	}

	@Override
	public void encender() {
		System.out.println("Patinete encendido");
		
	}

	@Override
	public void desplazarse(float distancia) {
		System.out.println("Te estas desplazando en patinete");
		
	}

}

	
	

