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
import org.orm.cfg.JDBCConnectionSetting;
import org.hibernate.*;
import java.util.Properties;
import org.hibernate.cfg.*;

public class ProyectoCompletoIluminatiPersistentManager extends PersistentManager {
	private static final String PROJECT_NAME = "ProyectoCompletoIluminati";
	private static PersistentManager _instance = null;
	private static SessionType _sessionType = SessionType.THREAD_BASE;
	private static int _timeToAlive = 60000;
	private static JDBCConnectionSetting _connectionSetting = null;
	private static Properties _extraProperties = null;
	private static String _configurationFile = null;
	
	private ProyectoCompletoIluminatiPersistentManager() throws PersistentException {
		super(_connectionSetting, _sessionType, _timeToAlive, new String[] {}, _extraProperties, _configurationFile);
		setFlushMode(FlushMode.AUTO);
	}
	
	@Override
	public Configuration createConfiguration() {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.Cliente.class);
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.Comercial.class);
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.Administrador.class);
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.Servicio.class);
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.ServiciosFFM.class);
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.ServicioTV.class);
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.Incidencia.class);
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.ServiciosCombi.class);
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.Canal.class);
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.Factura.class);
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.TipoIncidencia.class);
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.Terminales.class);
		configuration.addAnnotatedClass(diagrama_bd.base_de_datos.TipoTerminal.class);
		configuration.buildMappings();
		return configuration;
	}
	
	public String getProjectName() {
		return PROJECT_NAME;
	}
	
	public static synchronized final PersistentManager instance() throws PersistentException {
		if (_instance == null) {
			_instance = new ProyectoCompletoIluminatiPersistentManager();
		}
		
		return _instance;
	}
	
	public void disposePersistentManager() throws PersistentException {
		_instance = null;
		super.disposePersistentManager();
	}
	
	public static void setSessionType(SessionType sessionType) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session type after create PersistentManager instance");
		}
		else {
			_sessionType = sessionType;
		}
		
	}
	
	public static void setAppBaseSessionTimeToAlive(int timeInMs) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session time to alive after create PersistentManager instance");
		}
		else {
			_timeToAlive = timeInMs;
		}
		
	}
	
	public static void setJDBCConnectionSetting(JDBCConnectionSetting aConnectionSetting) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set connection setting after create PersistentManager instance");
		}
		else {
			_connectionSetting = aConnectionSetting;
		}
		
	}
	
	public static void setHibernateProperties(Properties aProperties) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set hibernate properties after create PersistentManager instance");
		}
		else {
			_extraProperties = aProperties;
		}
		
	}
	
	public static void setConfigurationFile(String aConfigurationFile) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set configuration file after create PersistentManager instance");
		}
		else {
			_configurationFile = aConfigurationFile;
		}
		
	}
	
	public static void saveJDBCConnectionSetting() {
		PersistentManager.saveJDBCConnectionSetting(PROJECT_NAME, _connectionSetting);
	}
}
