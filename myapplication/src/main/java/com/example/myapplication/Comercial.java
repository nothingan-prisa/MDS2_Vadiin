package com.example.myapplication;

public class Comercial extends ZonaComun {
	
	DatosPersonales dp = new DatosPersonales();
	ZonaClientes zc = new ZonaClientes();
	IncidenciasComercial ic = new IncidenciasComercial();
	
	public Comercial() {
		inicializar();
	}

	private void inicializar() {
		
		zonaComercial();
		//iconosF.addComponent(dp);
		//iconosF.addComponent(zc);
		iconosF.addComponent(ic);
		
	}
}