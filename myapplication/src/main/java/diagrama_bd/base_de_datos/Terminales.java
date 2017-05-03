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
@Table(name="Terminales")
public class Terminales implements Serializable {
	public Terminales() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_TERMINALES_DE_TIPO) {
			this.de_tipo = (diagrama_bd.base_de_datos.TipoTerminal) owner;
		}
		
		else if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_TERMINALES_SERVICIO) {
			this.servicio = (diagrama_bd.base_de_datos.Servicio) owner;
		}
		
		else if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_TERMINALES_CLIENTE) {
			this.cliente = (diagrama_bd.base_de_datos.Cliente) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="NTerminal", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="DIAGRAMA_BD_BASE_DE_DATOS_TERMINALES_NTERMINAL_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_BASE_DE_DATOS_TERMINALES_NTERMINAL_GENERATOR", strategy="native")	
	private int nTerminal;
	
	@ManyToOne(targetEntity=diagrama_bd.base_de_datos.TipoTerminal.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="TipoTerminalNTipoTerminal", referencedColumnName="NTipoTerminal") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private diagrama_bd.base_de_datos.TipoTerminal de_tipo;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@ManyToOne(targetEntity=diagrama_bd.base_de_datos.Cliente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ClienteNCliente", referencedColumnName="NCliente") })	
	private diagrama_bd.base_de_datos.Cliente cliente;
	
	@ManyToOne(targetEntity=diagrama_bd.base_de_datos.Servicio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ServicioID", referencedColumnName="ID", nullable=false) })	
	private diagrama_bd.base_de_datos.Servicio servicio;
	
	private void setnTerminal(int value) {
		this.nTerminal = value;
	}
	
	public int getnTerminal() {
		return nTerminal;
	}
	
	public int getORMID() {
		return getnTerminal();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setDe_tipo(diagrama_bd.base_de_datos.TipoTerminal value) {
		if (de_tipo != null) {
			de_tipo.tipifica.remove(this);
		}
		if (value != null) {
			value.tipifica.add(this);
		}
	}
	
	public diagrama_bd.base_de_datos.TipoTerminal getDe_tipo() {
		return de_tipo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_De_tipo(diagrama_bd.base_de_datos.TipoTerminal value) {
		this.de_tipo = value;
	}
	
	private diagrama_bd.base_de_datos.TipoTerminal getORM_De_tipo() {
		return de_tipo;
	}
	
	public void setServicio(diagrama_bd.base_de_datos.Servicio value) {
		if (servicio != null) {
			servicio.terminaless.remove(this);
		}
		if (value != null) {
			value.terminaless.add(this);
		}
	}
	
	public diagrama_bd.base_de_datos.Servicio getServicio() {
		return servicio;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Servicio(diagrama_bd.base_de_datos.Servicio value) {
		this.servicio = value;
	}
	
	private diagrama_bd.base_de_datos.Servicio getORM_Servicio() {
		return servicio;
	}
	
	public void setCliente(diagrama_bd.base_de_datos.Cliente value) {
		if (cliente != null) {
			cliente.terminaless.remove(this);
		}
		if (value != null) {
			value.terminaless.add(this);
		}
	}
	
	public diagrama_bd.base_de_datos.Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cliente(diagrama_bd.base_de_datos.Cliente value) {
		this.cliente = value;
	}
	
	private diagrama_bd.base_de_datos.Cliente getORM_Cliente() {
		return cliente;
	}
	
	public String toString() {
		return String.valueOf(getnTerminal());
	}
	
}
