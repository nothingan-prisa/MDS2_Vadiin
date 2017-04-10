package com.example.myapplication;

public class ZonaComun extends ZonaComun_V {
	
	ZonaMenuComun zmc = new ZonaMenuComun();
	
	public ZonaComun() {
		inicializar();
	}

	private void inicializar() {
		
		cssL.addComponent(zmc);
		
	}
	
	public void zonaAdmin() {
		zmc.menuAdmin();
	}
	
	public void zonaComercial() {
		zmc.menuComercial();
	}
	
	public void zonaCliente() {
		zmc.menuCliente();
	}
	
	public void zonaCibernauta() {
		zmc.menu.setVisible(false);
		zmc.tituloMenu.setCaption("");
		CabeceraCibernauta cc = new CabeceraCibernauta();
		cc.setStyleName("mytheme");
		head_iluminati.addComponent(cc);
	}
	
}