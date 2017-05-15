package com.example.myapplication;

public class Administrador extends ZonaComun {
	
	Admin_Principal ap = new Admin_Principal();
	Admin_Comerciales ac = new Admin_Comerciales();
	Admin_Incidencias ai = new Admin_Incidencias();
	Admin_Servicios as = new Admin_Servicios();
	ZonaClientes zc = new ZonaClientes();
	
	public Administrador() {
		inicializar();
	}

	private void inicializar() {
		
		zonaAdmin();
		
		//iconosF.addComponent(as);
		//iconosF.addComponent(ai);
		//iconosF.addComponent(ac);
		//iconosF.addComponent(zc);
		iconosF.addComponent(ap);
		
	}
}