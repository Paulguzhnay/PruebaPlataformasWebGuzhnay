package ec.edu.ups.prueba.services;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;


import ec.edu.ups.prueba.business.ArteONLocal;
import ec.edu.ups.prueba.model.Arte;

@WebService
public class ArteSOAP {

	@Inject
	private ArteONLocal artON;
	
	@WebMethod
	public String insertar(Arte modelA) {
	

		
		try {
			artON.guardar(modelA);
			return "Felicidades Obra Ingresada";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Obra NO INGRESADA";
	}
	
	@WebMethod
	public List<Arte> getObras(){
		return artON.getArte();
	}
	
}
