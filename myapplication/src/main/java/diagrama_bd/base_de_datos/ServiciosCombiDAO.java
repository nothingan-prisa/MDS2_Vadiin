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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ServiciosCombiDAO {
	public static ServiciosCombi loadServiciosCombiByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServiciosCombiByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi getServiciosCombiByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getServiciosCombiByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi loadServiciosCombiByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServiciosCombiByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi getServiciosCombiByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getServiciosCombiByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi loadServiciosCombiByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ServiciosCombi) session.load(diagrama_bd.base_de_datos.ServiciosCombi.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi getServiciosCombiByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ServiciosCombi) session.get(diagrama_bd.base_de_datos.ServiciosCombi.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi loadServiciosCombiByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ServiciosCombi) session.load(diagrama_bd.base_de_datos.ServiciosCombi.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi getServiciosCombiByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ServiciosCombi) session.get(diagrama_bd.base_de_datos.ServiciosCombi.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServiciosCombi(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryServiciosCombi(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServiciosCombi(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryServiciosCombi(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi[] listServiciosCombiByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listServiciosCombiByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi[] listServiciosCombiByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listServiciosCombiByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServiciosCombi(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.ServiciosCombi as ServiciosCombi");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServiciosCombi(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.ServiciosCombi as ServiciosCombi");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ServiciosCombi", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi[] listServiciosCombiByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryServiciosCombi(session, condition, orderBy);
			return (ServiciosCombi[]) list.toArray(new ServiciosCombi[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi[] listServiciosCombiByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryServiciosCombi(session, condition, orderBy, lockMode);
			return (ServiciosCombi[]) list.toArray(new ServiciosCombi[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi loadServiciosCombiByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServiciosCombiByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi loadServiciosCombiByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServiciosCombiByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi loadServiciosCombiByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ServiciosCombi[] serviciosCombis = listServiciosCombiByQuery(session, condition, orderBy);
		if (serviciosCombis != null && serviciosCombis.length > 0)
			return serviciosCombis[0];
		else
			return null;
	}
	
	public static ServiciosCombi loadServiciosCombiByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ServiciosCombi[] serviciosCombis = listServiciosCombiByQuery(session, condition, orderBy, lockMode);
		if (serviciosCombis != null && serviciosCombis.length > 0)
			return serviciosCombis[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateServiciosCombiByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateServiciosCombiByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServiciosCombiByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateServiciosCombiByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServiciosCombiByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.ServiciosCombi as ServiciosCombi");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServiciosCombiByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.ServiciosCombi as ServiciosCombi");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ServiciosCombi", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi createServiciosCombi() {
		return new diagrama_bd.base_de_datos.ServiciosCombi();
	}
	
	public static boolean save(diagrama_bd.base_de_datos.ServiciosCombi serviciosCombi) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().saveObject(serviciosCombi);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(diagrama_bd.base_de_datos.ServiciosCombi serviciosCombi) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().deleteObject(serviciosCombi);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.ServiciosCombi serviciosCombi)throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ServiciosFFM[] lOfreceFFMs = serviciosCombi.ofreceFFM.toArray();
			for(int i = 0; i < lOfreceFFMs.length; i++) {
				lOfreceFFMs[i].es_parte.remove(serviciosCombi);
			}
			if (serviciosCombi.getOfreceTV() != null) {
				serviciosCombi.getOfreceTV().es_parte.remove(serviciosCombi);
			}
			
			if (serviciosCombi.getGenera() != null) {
				serviciosCombi.getGenera().corresponde_a.remove(serviciosCombi);
			}
			
			diagrama_bd.base_de_datos.Terminales[] lTerminalesss = serviciosCombi.terminaless.toArray();
			for(int i = 0; i < lTerminalesss.length; i++) {
				lTerminalesss[i].setServicio(null);
			}
			return delete(serviciosCombi);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.ServiciosCombi serviciosCombi, org.orm.PersistentSession session)throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ServiciosFFM[] lOfreceFFMs = serviciosCombi.ofreceFFM.toArray();
			for(int i = 0; i < lOfreceFFMs.length; i++) {
				lOfreceFFMs[i].es_parte.remove(serviciosCombi);
			}
			if (serviciosCombi.getOfreceTV() != null) {
				serviciosCombi.getOfreceTV().es_parte.remove(serviciosCombi);
			}
			
			if (serviciosCombi.getGenera() != null) {
				serviciosCombi.getGenera().corresponde_a.remove(serviciosCombi);
			}
			
			diagrama_bd.base_de_datos.Terminales[] lTerminalesss = serviciosCombi.terminaless.toArray();
			for(int i = 0; i < lTerminalesss.length; i++) {
				lTerminalesss[i].setServicio(null);
			}
			try {
				session.delete(serviciosCombi);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(diagrama_bd.base_de_datos.ServiciosCombi serviciosCombi) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().refresh(serviciosCombi);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(diagrama_bd.base_de_datos.ServiciosCombi serviciosCombi) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().evict(serviciosCombi);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosCombi loadServiciosCombiByCriteria(ServiciosCombiCriteria serviciosCombiCriteria) {
		ServiciosCombi[] serviciosCombis = listServiciosCombiByCriteria(serviciosCombiCriteria);
		if(serviciosCombis == null || serviciosCombis.length == 0) {
			return null;
		}
		return serviciosCombis[0];
	}
	
	public static ServiciosCombi[] listServiciosCombiByCriteria(ServiciosCombiCriteria serviciosCombiCriteria) {
		return serviciosCombiCriteria.listServiciosCombi();
	}
}
