package com.example.myapplication;

public class Cliente extends ZonaComun {
	
	MisContratos mc = new MisContratos();
	MisDatos md = new MisDatos();
	MisIncidencias mi = new MisIncidencias();
	MisFacturas mf = new MisFacturas();
	
	public Cliente() {
		inicializar();
	}

	private void inicializar() {
		
		zonaCliente();
		//iconosF.addComponent(mc);
		//iconosF.addComponent(md);
		iconosF.addComponent(mf);
		//iconosF.addComponent(mi);
		
	}

}