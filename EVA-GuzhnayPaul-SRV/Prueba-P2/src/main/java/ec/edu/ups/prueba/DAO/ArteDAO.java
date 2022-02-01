package ec.edu.ups.prueba.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.prueba.model.Arte;



@Stateless
public class ArteDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Arte art) {
		em.persist(art);
	}
	
	public void update (Arte art) {
		em.merge(art);
	}
	
	public Arte read(String id) {
		Arte art=em.find(Arte.class,id);
		return art;
	}

	public void delete (String id) {
		Arte art = em.find(Arte.class, id);
		em.remove(art);
	}
	
	public List <Arte> getList(){
		List<Arte> listado = new ArrayList<Arte>();
		
		String jpql ="SELECT art FROM Arte art ";
		Query query = em.createQuery(jpql, Arte.class);
		listado = query.getResultList();
		//JPQL -> SQL 
		
		
		return listado;
	}

}
