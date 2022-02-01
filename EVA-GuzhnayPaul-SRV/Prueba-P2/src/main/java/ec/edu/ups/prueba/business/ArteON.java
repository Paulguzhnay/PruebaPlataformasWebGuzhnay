package ec.edu.ups.prueba.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.prueba.model.Arte;
import ec.edu.ups.prueba.DAO.ArteDAO;

@Stateless
public class ArteON implements ArteONLocal{

	@Inject
	private ArteDAO daoArte;
	
	public void insertar(Arte art) throws Exception  {
		daoArte.insert(art);
	}
	public void guardar(Arte art) throws Exception  {
		if(daoArte.read(art.getCodigo())==null)
			daoArte.insert(art);
		else
			daoArte.update(art);
			
	}
	
	public List <Arte> getArte(){
		return daoArte.getList();
	}
	
	public Arte getArte(String codigo) {
		return daoArte.read(codigo);
	}

}
