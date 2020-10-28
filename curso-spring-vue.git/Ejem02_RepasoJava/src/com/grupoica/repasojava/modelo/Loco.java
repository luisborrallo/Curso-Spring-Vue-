package com.grupoica.repasojava.modelo;

public class Loco extends Usuario {

	private boolean tipoLocura;
	
	

	public Loco(boolean tipoLocura) {
		super();
		this.tipoLocura = tipoLocura;
	}
	
	public Loco(boolean tipo, String nombre, int edad) {
		super(nombre, edad);
		this.tipoLocura = tipo;
	}

	public boolean isTipoLocura() {
		return tipoLocura;
	}

	public void setTipoLocura(boolean tipoLocura) {
		this.tipoLocura = tipoLocura;
	}


	@Override
	public boolean equals(Object obj) {
		Loco loco = (Loco) obj;
		Usuario userLoco = new Usuario(loco.getNombre(),loco.getEdad());
		return this.tipoLocura==loco.tipoLocura && super.equals(userLoco);
	}
	
	public boolean equal (Loco loco) {
		return(tipoLocura==loco.tipoLocura && super.equals(loco));
	}
	

	@Override
	public String toString() {
		return "Loco tipoLocura=" + tipoLocura + " " +super.toString();
	}
	
	
	
}

