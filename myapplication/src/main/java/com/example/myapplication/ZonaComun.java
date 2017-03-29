package com.example.myapplication;

public class ZonaComun extends ZonaComun_V {
//	public ZonaIconos _unnamed_ZonaIconos_;
//	public ZonaCentral _unnamed_ZonaCentral_;
	
	public ZonaComun() {
		inicializar();
	}

	private void inicializar() {
		ZonaMenuComun zmc = new ZonaMenuComun();
		cssL.addComponent(zmc);
		
	}
}