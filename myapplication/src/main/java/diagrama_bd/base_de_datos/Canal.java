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
@Table(name="Canal")
public class Canal implements Serializable {
	public Canal() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_CANAL_ES_PARTE) {
			return ORM_es_parte;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="DIAGRAMA_BD_BASE_DE_DATOS_CANAL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_BASE_DE_DATOS_CANAL_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="NCanal", nullable=true, length=255)	
	private String nCanal;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Categoria", nullable=true, length=255)	
	private String categoria;
	
	@Column(name="RutaIcono", nullable=true, length=255)	
	private String rutaIcono;
	
	@ManyToMany(targetEntity=diagrama_bd.base_de_datos.ServicioTV.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Servicio_Canal", joinColumns={ @JoinColumn(name="CanalID") }, inverseJoinColumns={ @JoinColumn(name="ServicioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_parte = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setnCanal(String value) {
		this.nCanal = value;
	}
	
	public String getnCanal() {
		return nCanal;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setCategoria(String value) {
		this.categoria = value;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setRutaIcono(String value) {
		this.rutaIcono = value;
	}
	
	public String getRutaIcono() {
		return rutaIcono;
	}
	
	private void setORM_Es_parte(java.util.Set value) {
		this.ORM_es_parte = value;
	}
	
	private java.util.Set getORM_Es_parte() {
		return ORM_es_parte;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.ServicioTVSetCollection es_parte = new diagrama_bd.base_de_datos.ServicioTVSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_CANAL_ES_PARTE, diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIOTV_COMPUESTO_POR, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
