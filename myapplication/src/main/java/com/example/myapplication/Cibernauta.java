package com.example.myapplication;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;

public class Cibernauta extends ZonaComun {
	
	public Cibernauta() {
		inicializar();
	}

	private void inicializar() {
		
		zonaCibernauta();
		viewTitle.setVisible(false);
		viewTitle.setEnabled(false);
		content.setVisible(false);
		content.setEnabled(false);
		contenido.setStyleName("mystyle");
		contenido.setHeight(662, Unit.PIXELS);
		
		HorizontalLayout hl = new HorizontalLayout();
		HorizontalLayout hl2 = new HorizontalLayout();
		
		hl.setStyleName("margenesO");
		hl2.setStyleName("margenesO");
		
		contenido.addComponent(hl);
		contenido.addComponent(hl2);
		
		Button o1 = new Button("OFERTA 1");
		Button o2 = new Button("OFERTA 2");
		Button o3 = new Button("OFERTA 3");
		Button o4 = new Button("OFERTA 4");
		Button o5 = new Button("OFERTA 5");
		Button o6 = new Button("OFERTA 6");
		
		
		o1.setStyleName("botonesOfertas");
		o2.setStyleName("botonesOfertas");
		o3.setStyleName("botonesOfertas");
		o4.setStyleName("botonesOfertas");
		o5.setStyleName("botonesOfertas");
		o6.setStyleName("botonesOfertas");
		
		hl.addComponent(o1);
		hl.addComponent(o2);
		hl.addComponent(o3);
		hl2.addComponent(o4);
		hl2.addComponent(o5);
		hl2.addComponent(o6);
		
		//hl.setVisible(true);
		//o1.setVisible(true);
	}
}
