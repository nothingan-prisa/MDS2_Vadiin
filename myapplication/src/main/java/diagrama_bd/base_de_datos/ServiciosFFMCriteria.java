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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ServiciosFFMCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression generaId;
	public final AssociationExpression genera;
	public final StringExpression nombre;
	public final StringExpression nServicio;
	public final FloatExpression precio;
	public final StringExpression caracteristicas;
	public final BooleanExpression visible;
	public final CollectionExpression terminaless;
	public final IntegerExpression nServFFM;
	public final CollectionExpression es_parte;
	
	public ServiciosFFMCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		generaId = new IntegerExpression("genera.nFactura", this);
		genera = new AssociationExpression("genera", this);
		nombre = new StringExpression("nombre", this);
		nServicio = new StringExpression("nServicio", this);
		precio = new FloatExpression("precio", this);
		caracteristicas = new StringExpression("caracteristicas", this);
		visible = new BooleanExpression("visible", this);
		terminaless = new CollectionExpression("ORM_terminaless", this);
		nServFFM = new IntegerExpression("nServFFM", this);
		es_parte = new CollectionExpression("ORM_es_parte", this);
	}
	
	public ServiciosFFMCriteria(PersistentSession session) {
		this(session.createCriteria(ServiciosFFM.class));
	}
	
	public ServiciosFFMCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public diagrama_bd.base_de_datos.ServiciosCombiCriteria createEs_parteCriteria() {
		return new diagrama_bd.base_de_datos.ServiciosCombiCriteria(createCriteria("ORM_es_parte"));
	}
	
	public FacturaCriteria createGeneraCriteria() {
		return new FacturaCriteria(createCriteria("genera"));
	}
	
	public diagrama_bd.base_de_datos.TerminalesCriteria createTerminalessCriteria() {
		return new diagrama_bd.base_de_datos.TerminalesCriteria(createCriteria("ORM_terminaless"));
	}
	
	public ServiciosFFM uniqueServiciosFFM() {
		return (ServiciosFFM) super.uniqueResult();
	}
	
	public ServiciosFFM[] listServiciosFFM() {
		java.util.List list = super.list();
		return (ServiciosFFM[]) list.toArray(new ServiciosFFM[list.size()]);
	}
}

