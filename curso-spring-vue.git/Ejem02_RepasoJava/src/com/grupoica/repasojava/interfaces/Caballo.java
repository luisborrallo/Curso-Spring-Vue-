package com.grupoica.repasojava.interfaces;

public class Caballo extends Vehiculo {

	private int dientes;
	
	public Caballo(String marca, float peso, int raza) {
		super(marca, peso);
		this.dientes = raza;
	}

	public int getRaza() {
		return dientes;
	}

	public void setRaza(int raza) {
		this.dientes = raza;
	}

	@Override
	public void aceleracion() {
		// TODO Auto-generated method stub
		System.out.println(super.getMarca()+" Acelerando, es un caballo, apartaos");
	}



	@Override
	public void desplazarse(float distancia) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
