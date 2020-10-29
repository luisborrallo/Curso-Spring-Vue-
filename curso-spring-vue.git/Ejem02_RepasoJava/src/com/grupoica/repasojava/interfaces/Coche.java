package com.grupoica.repasojava.interfaces;

public class Coche extends Vehiculo implements Motorizable{
	
	private float gasolina;

	public Coche(String marca, float peso, float gasolina) {
		super(marca, peso);
		this.gasolina = gasolina;
	}

	public float getGasolina() {
		return gasolina;
	}

	public void setGasolina(float gasolina) {
		this.gasolina = gasolina;
	}

	@Override
	public void aceleracion() {
		// TODO Auto-generated method stub
		//super.aceleracion();
		System.out.println(super.getMarca()+" Acelerando, es un coche, cuidado");
	}



	@Override
	public void encender() {
		System.out.println("Arranco el coche "+ super.getMarca() + " metiendo la llave");
		
	}

	@Override
	public void desplazarse(float distancia) {
		// TODO Auto-generated method stub
		
	}
	
	

}
