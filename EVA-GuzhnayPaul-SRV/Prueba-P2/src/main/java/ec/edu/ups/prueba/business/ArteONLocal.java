package ec.edu.ups.prueba.business;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.prueba.model.Arte;
import ec.edu.ups.prueba.DAO.ArteDAO;

@Local
public interface ArteONLocal {

	
	public void insertar(Arte art) throws Exception ;
	public void guardar(Arte art) throws Exception;
	
	public List <Arte> getArte();
	
	public Arte getArte(String codigo) ;

}
