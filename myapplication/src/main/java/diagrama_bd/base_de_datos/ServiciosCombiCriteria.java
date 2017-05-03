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

public class ServiciosCombiCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression generaId;
	public final AssociationExpression genera;
	public final StringExpression nombre;
	public final StringExpression nServicio;
	public final FloatExpression precio;
	public final StringExpression caracteristicas;
	public final BooleanExpression visible;
	public final CollectionExpression terminaless;
	public final CollectionExpression ofreceFFM;
	public final IntegerExpression nServCombi;
	public final IntegerExpression ofreceTVId;
	public final AssociationExpression ofreceTV;
	
	public ServiciosCombiCriteria(Criteria criteria) {
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
		ofreceFFM = new CollectionExpression("ORM_ofreceFFM", this);
		nServCombi = new IntegerExpression("nServCombi", this);
		ofreceTVId = new IntegerExpression("ofreceTV.ID", this);
		ofreceTV = new AssociationExpression("ofreceTV", this);
	}
	
	public ServiciosCombiCriteria(PersistentSession session) {
		this(session.createCriteria(ServiciosCombi.class));
	}
	
	public ServiciosCombiCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public diagrama_bd.base_de_datos.ServiciosFFMCriteria createOfreceFFMCriteria() {
		return new diagrama_bd.base_de_datos.ServiciosFFMCriteria(createCriteria("ORM_ofreceFFM"));
	}
	
	public ServicioTVCriteria createOfreceTVCriteria() {
		return new ServicioTVCriteria(createCriteria("ofreceTV"));
	}
	
	public FacturaCriteria createGeneraCriteria() {
		return new FacturaCriteria(createCriteria("genera"));
	}
	
	public diagrama_bd.base_de_datos.TerminalesCriteria createTerminalessCriteria() {
		return new diagrama_bd.base_de_datos.TerminalesCriteria(createCriteria("ORM_terminaless"));
	}
	
	public ServiciosCombi uniqueServiciosCombi() {
		return (ServiciosCombi) super.uniqueResult();
	}
	
	public ServiciosCombi[] listServiciosCombi() {
		java.util.List list = super.list();
		return (ServiciosCombi[]) list.toArray(new ServiciosCombi[list.size()]);
	}
}

