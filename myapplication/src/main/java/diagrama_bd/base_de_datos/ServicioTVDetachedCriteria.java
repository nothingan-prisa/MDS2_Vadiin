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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ServicioTVDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression generaId;
	public final AssociationExpression genera;
	public final StringExpression nombre;
	public final StringExpression nServicio;
	public final FloatExpression precio;
	public final StringExpression caracteristicas;
	public final BooleanExpression visible;
	public final CollectionExpression terminaless;
	public final IntegerExpression nServicioTV;
	public final CollectionExpression es_parte;
	public final CollectionExpression compuesto_por;
	
	public ServicioTVDetachedCriteria() {
		super(diagrama_bd.base_de_datos.ServicioTV.class, diagrama_bd.base_de_datos.ServicioTVCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		generaId = new IntegerExpression("genera.nFactura", this.getDetachedCriteria());
		genera = new AssociationExpression("genera", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		nServicio = new StringExpression("nServicio", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		visible = new BooleanExpression("visible", this.getDetachedCriteria());
		terminaless = new CollectionExpression("ORM_terminaless", this.getDetachedCriteria());
		nServicioTV = new IntegerExpression("nServicioTV", this.getDetachedCriteria());
		es_parte = new CollectionExpression("ORM_es_parte", this.getDetachedCriteria());
		compuesto_por = new CollectionExpression("ORM_compuesto_por", this.getDetachedCriteria());
	}
	
	public ServicioTVDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_bd.base_de_datos.ServicioTVCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		generaId = new IntegerExpression("genera.nFactura", this.getDetachedCriteria());
		genera = new AssociationExpression("genera", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		nServicio = new StringExpression("nServicio", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		visible = new BooleanExpression("visible", this.getDetachedCriteria());
		terminaless = new CollectionExpression("ORM_terminaless", this.getDetachedCriteria());
		nServicioTV = new IntegerExpression("nServicioTV", this.getDetachedCriteria());
		es_parte = new CollectionExpression("ORM_es_parte", this.getDetachedCriteria());
		compuesto_por = new CollectionExpression("ORM_compuesto_por", this.getDetachedCriteria());
	}
	
	public diagrama_bd.base_de_datos.ServiciosCombiDetachedCriteria createEs_parteCriteria() {
		return new diagrama_bd.base_de_datos.ServiciosCombiDetachedCriteria(createCriteria("ORM_es_parte"));
	}
	
	public diagrama_bd.base_de_datos.CanalDetachedCriteria createCompuesto_porCriteria() {
		return new diagrama_bd.base_de_datos.CanalDetachedCriteria(createCriteria("ORM_compuesto_por"));
	}
	
	public diagrama_bd.base_de_datos.FacturaDetachedCriteria createGeneraCriteria() {
		return new diagrama_bd.base_de_datos.FacturaDetachedCriteria(createCriteria("genera"));
	}
	
	public diagrama_bd.base_de_datos.TerminalesDetachedCriteria createTerminalessCriteria() {
		return new diagrama_bd.base_de_datos.TerminalesDetachedCriteria(createCriteria("ORM_terminaless"));
	}
	
	public ServicioTV uniqueServicioTV(PersistentSession session) {
		return (ServicioTV) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ServicioTV[] listServicioTV(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ServicioTV[]) list.toArray(new ServicioTV[list.size()]);
	}
}

