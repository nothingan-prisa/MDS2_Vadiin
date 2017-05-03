package com.example.myapplication;

public class Cliente extends ZonaComun {
	
	MisContratos mc = new MisContratos();
	MisDatos md = new MisDatos();
	MisIncidencias mi = new MisIncidencias();
	
	public Cliente() {
		inicializar();
	}

	private void inicializar() {
		
		zonaCliente();
		//iconosF.addComponent(mc);
		iconosF.addComponent(md);
		//iconosF.addComponent(mi);
		
	}

}