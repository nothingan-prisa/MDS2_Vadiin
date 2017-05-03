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

public class ClienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression nCliente;
	public final IntegerExpression DNI;
	public final StringExpression nombre;
	public final StringExpression apellido1;
	public final StringExpression apellido2;
	public final StringExpression domicilio;
	public final StringExpression email;
	public final StringExpression IBAN;
	public final StringExpression password;
	public final CollectionExpression terminaless;
	public final CollectionExpression reclama;
	
	public ClienteCriteria(Criteria criteria) {
		super(criteria);
		nCliente = new IntegerExpression("nCliente", this);
		DNI = new IntegerExpression("DNI", this);
		nombre = new StringExpression("nombre", this);
		apellido1 = new StringExpression("apellido1", this);
		apellido2 = new StringExpression("apellido2", this);
		domicilio = new StringExpression("domicilio", this);
		email = new StringExpression("email", this);
		IBAN = new StringExpression("IBAN", this);
		password = new StringExpression("password", this);
		terminaless = new CollectionExpression("ORM_terminaless", this);
		reclama = new CollectionExpression("ORM_reclama", this);
	}
	
	public ClienteCriteria(PersistentSession session) {
		this(session.createCriteria(Cliente.class));
	}
	
	public ClienteCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public diagrama_bd.base_de_datos.TerminalesCriteria createTerminalessCriteria() {
		return new diagrama_bd.base_de_datos.TerminalesCriteria(createCriteria("ORM_terminaless"));
	}
	
	public diagrama_bd.base_de_datos.IncidenciaCriteria createReclamaCriteria() {
		return new diagrama_bd.base_de_datos.IncidenciaCriteria(createCriteria("ORM_reclama"));
	}
	
	public Cliente uniqueCliente() {
		return (Cliente) super.uniqueResult();
	}
	
	public Cliente[] listCliente() {
		java.util.List list = super.list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

