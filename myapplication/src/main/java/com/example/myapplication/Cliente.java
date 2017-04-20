package com.example.myapplication;

public class Cliente extends ZonaComun {
	
	MisContratos mc = new MisContratos();
	
	public Cliente() {
		inicializar();
	}

	private void inicializar() {
		
		zonaCliente();
		iconosF.addComponent(mc);;
		
	}

}