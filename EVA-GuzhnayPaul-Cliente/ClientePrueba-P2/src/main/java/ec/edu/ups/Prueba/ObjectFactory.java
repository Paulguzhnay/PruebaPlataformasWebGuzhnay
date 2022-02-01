
package ec.edu.ups.Prueba;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.Prueba package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetObras_QNAME = new QName("http://services.prueba.ups.edu.ec/", "getObras");
    private final static QName _GetObrasResponse_QNAME = new QName("http://services.prueba.ups.edu.ec/", "getObrasResponse");
    private final static QName _Insertar_QNAME = new QName("http://services.prueba.ups.edu.ec/", "insertar");
    private final static QName _InsertarResponse_QNAME = new QName("http://services.prueba.ups.edu.ec/", "insertarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.Prueba
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetObras }
     * 
     */
    public GetObras createGetObras() {
        return new GetObras();
    }

    /**
     * Create an instance of {@link GetObrasResponse }
     * 
     */
    public GetObrasResponse createGetObrasResponse() {
        return new GetObrasResponse();
    }

    /**
     * Create an instance of {@link Insertar }
     * 
     */
    public Insertar createInsertar() {
        return new Insertar();
    }

    /**
     * Create an instance of {@link InsertarResponse }
     * 
     */
    public InsertarResponse createInsertarResponse() {
        return new InsertarResponse();
    }

    /**
     * Create an instance of {@link Arte }
     * 
     */
    public Arte createArte() {
        return new Arte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObras }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObras }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.prueba.ups.edu.ec/", name = "getObras")
    public JAXBElement<GetObras> createGetObras(GetObras value) {
        return new JAXBElement<GetObras>(_GetObras_QNAME, GetObras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObrasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObrasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.prueba.ups.edu.ec/", name = "getObrasResponse")
    public JAXBElement<GetObrasResponse> createGetObrasResponse(GetObrasResponse value) {
        return new JAXBElement<GetObrasResponse>(_GetObrasResponse_QNAME, GetObrasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insertar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Insertar }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.prueba.ups.edu.ec/", name = "insertar")
    public JAXBElement<Insertar> createInsertar(Insertar value) {
        return new JAXBElement<Insertar>(_Insertar_QNAME, Insertar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.prueba.ups.edu.ec/", name = "insertarResponse")
    public JAXBElement<InsertarResponse> createInsertarResponse(InsertarResponse value) {
        return new JAXBElement<InsertarResponse>(_InsertarResponse_QNAME, InsertarResponse.class, null, value);
    }

}
