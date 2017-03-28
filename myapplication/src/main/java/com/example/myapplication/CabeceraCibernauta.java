package com.example.myapplication;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

public class CabeceraCibernauta extends CabeceraCibernauta_V {
	/*private Button _acceso;
	private Label _nTelefonoL;
	public cibernauta _unnamed_cibernauta_;
	public iniciarSesion _inicia;*/
		
	
	CabeceraComun_V cc = new CabeceraComun();
	
	public CabeceraCibernauta() {
		
		Inicializar();
	}

	void Inicializar() {
		horizontalL.addComponent(cc);
		
	}
	
	
}