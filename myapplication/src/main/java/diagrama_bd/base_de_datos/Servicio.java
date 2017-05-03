/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package diagrama_bd.base_de_datos;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Servicio")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Servicio")
public class Servicio implements Serializable {
	public Servicio() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIO_TERMINALESS) {
			return ORM_terminaless;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIO_GENERA) {
			this.genera = (diagrama_bd.base_de_datos.Factura) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="DIAGRAMA_BD_BASE_DE_DATOS_SERVICIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_BASE_DE_DATOS_SERVICIO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=diagrama_bd.base_de_datos.Factura.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="FacturaNFactura", referencedColumnName="NFactura") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private diagrama_bd.base_de_datos.Factura genera;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="NServicio", nullable=true, length=255)	
	private String nServicio;
	
	@Column(name="Precio", nullable=true)	
	private Float precio;
	
	@Column(name="Caracteristicas", nullable=true, length=255)	
	private String caracteristicas;
	
	@Column(name="Visible", nullable=true, length=1)	
	private Boolean visible;
	
	@OneToMany(mappedBy="servicio", targetEntity=diagrama_bd.base_de_datos.Terminales.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_terminaless = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setnServicio(String value) {
		this.nServicio = value;
	}
	
	public String getnServicio() {
		return nServicio;
	}
	
	public void setPrecio(float value) {
		setPrecio(new Float(value));
	}
	
	public void setPrecio(Float value) {
		this.precio = value;
	}
	
	public Float getPrecio() {
		return precio;
	}
	
	public void setCaracteristicas(String value) {
		this.caracteristicas = value;
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}
	
	public void setVisible(boolean value) {
		setVisible(new Boolean(value));
	}
	
	public void setVisible(Boolean value) {
		this.visible = value;
	}
	
	public Boolean getVisible() {
		return visible;
	}
	
	public diagrama_bd.base_de_datos.Cliente[] getClientes() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = terminaless.getIterator();lIter.hasNext();) {
			lValues.add(((diagrama_bd.base_de_datos.Terminales)lIter.next()).getCliente());
		}
		return (diagrama_bd.base_de_datos.Cliente[])lValues.toArray(new diagrama_bd.base_de_datos.Cliente[lValues.size()]);
	}
	
	public void removeCliente(diagrama_bd.base_de_datos.Cliente aCliente) {
		diagrama_bd.base_de_datos.Terminales[] lTerminaless = terminaless.toArray();
		for(int i = 0; i < lTerminaless.length; i++) {
			if(lTerminaless[i].getCliente().equals(aCliente)) {
				terminaless.remove(lTerminaless[i]);
			}
		}
	}
	
	public void addCliente(diagrama_bd.base_de_datos.Terminales aTerminales, diagrama_bd.base_de_datos.Cliente aCliente) {
		aTerminales.setCliente(aCliente);
		terminaless.add(aTerminales);
	}
	
	public diagrama_bd.base_de_datos.Terminales getTerminalesByCliente(diagrama_bd.base_de_datos.Cliente aCliente) {
		diagrama_bd.base_de_datos.Terminales[] lTerminaless = terminaless.toArray();
		for(int i = 0; i < lTerminaless.length; i++) {
			if(lTerminaless[i].getCliente().equals(aCliente)) {
				return lTerminaless[i];
			}
		}
		return null;
	}
	
	private void setORM_Terminaless(java.util.Set value) {
		this.ORM_terminaless = value;
	}
	
	private java.util.Set getORM_Terminaless() {
		return ORM_terminaless;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.TerminalesSetCollection terminaless = new diagrama_bd.base_de_datos.TerminalesSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIO_TERMINALESS, diagrama_bd.base_de_datos.ORMConstants.KEY_TERMINALES_SERVICIO, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setGenera(diagrama_bd.base_de_datos.Factura value) {
		if (genera != null) {
			genera.corresponde_a.remove(this);
		}
		if (value != null) {
			value.corresponde_a.add(this);
		}
	}
	
	public diagrama_bd.base_de_datos.Factura getGenera() {
		return genera;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Genera(diagrama_bd.base_de_datos.Factura value) {
		this.genera = value;
	}
	
	private diagrama_bd.base_de_datos.Factura getORM_Genera() {
		return genera;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
