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

public class TerminalesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression nTerminal;
	public final IntegerExpression de_tipoId;
	public final AssociationExpression de_tipo;
	public final StringExpression nombre;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression servicioId;
	public final AssociationExpression servicio;
	
	public TerminalesDetachedCriteria() {
		super(diagrama_bd.base_de_datos.Terminales.class, diagrama_bd.base_de_datos.TerminalesCriteria.class);
		nTerminal = new IntegerExpression("nTerminal", this.getDetachedCriteria());
		de_tipoId = new IntegerExpression("de_tipo.nTipoTerminal", this.getDetachedCriteria());
		de_tipo = new AssociationExpression("de_tipo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		clienteId = new IntegerExpression("ORM_Cliente.null", this.getDetachedCriteria());
		cliente = new AssociationExpression("ORM_Cliente", this.getDetachedCriteria());
		servicioId = new IntegerExpression("ORM_Servicio.null", this.getDetachedCriteria());
		servicio = new AssociationExpression("ORM_Servicio", this.getDetachedCriteria());
	}
	
	public TerminalesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_bd.base_de_datos.TerminalesCriteria.class);
		nTerminal = new IntegerExpression("nTerminal", this.getDetachedCriteria());
		de_tipoId = new IntegerExpression("de_tipo.nTipoTerminal", this.getDetachedCriteria());
		de_tipo = new AssociationExpression("de_tipo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		clienteId = new IntegerExpression("ORM_Cliente.null", this.getDetachedCriteria());
		cliente = new AssociationExpression("ORM_Cliente", this.getDetachedCriteria());
		servicioId = new IntegerExpression("ORM_Servicio.null", this.getDetachedCriteria());
		servicio = new AssociationExpression("ORM_Servicio", this.getDetachedCriteria());
	}
	
	public diagrama_bd.base_de_datos.TipoTerminalDetachedCriteria createDe_tipoCriteria() {
		return new diagrama_bd.base_de_datos.TipoTerminalDetachedCriteria(createCriteria("de_tipo"));
	}
	
	public diagrama_bd.base_de_datos.ClienteDetachedCriteria createClienteCriteria() {
		return new diagrama_bd.base_de_datos.ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public diagrama_bd.base_de_datos.ServicioDetachedCriteria createServicioCriteria() {
		return new diagrama_bd.base_de_datos.ServicioDetachedCriteria(createCriteria("servicio"));
	}
	
	public Terminales uniqueTerminales(PersistentSession session) {
		return (Terminales) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Terminales[] listTerminales(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Terminales[]) list.toArray(new Terminales[list.size()]);
	}
}

