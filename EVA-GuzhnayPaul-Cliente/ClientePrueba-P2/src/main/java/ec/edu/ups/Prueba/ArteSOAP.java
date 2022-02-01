package ec.edu.ups.Prueba;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-02-01T11:54:33.008-05:00
 * Generated source version: 3.5.0
 *
 */
@WebService(targetNamespace = "http://services.prueba.ups.edu.ec/", name = "ArteSOAP")
@XmlSeeAlso({ObjectFactory.class})
public interface ArteSOAP {

    @WebMethod
    @RequestWrapper(localName = "getObras", targetNamespace = "http://services.prueba.ups.edu.ec/", className = "ec.edu.ups.Prueba.GetObras")
    @ResponseWrapper(localName = "getObrasResponse", targetNamespace = "http://services.prueba.ups.edu.ec/", className = "ec.edu.ups.Prueba.GetObrasResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ec.edu.ups.Prueba.Arte> getObras()
;

    @WebMethod
    @RequestWrapper(localName = "insertar", targetNamespace = "http://services.prueba.ups.edu.ec/", className = "ec.edu.ups.Prueba.Insertar")
    @ResponseWrapper(localName = "insertarResponse", targetNamespace = "http://services.prueba.ups.edu.ec/", className = "ec.edu.ups.Prueba.InsertarResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String insertar(

        @WebParam(name = "arg0", targetNamespace = "")
        ec.edu.ups.Prueba.Arte arg0
    );
}