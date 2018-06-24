package org.fkjava.cxf.ws.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import org.fkjava.cxf.ws.HelloWorld;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2018-06-24T22:38:18.152+08:00
 * Generated source version: 2.5.9
 * 
 */
@WebServiceClient(name = "helloWorldWs", 
                  wsdlLocation = "http://127.0.0.1:9999/fkjava?wsdl",
                  targetNamespace = "http://impl.ws.cxf.fkjava.org/") 
public class HelloWorldWs extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.ws.cxf.fkjava.org/", "helloWorldWs");
    public final static QName HelloWorldWsPort = new QName("http://impl.ws.cxf.fkjava.org/", "HelloWorldWsPort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:9999/fkjava?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWorldWs.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:9999/fkjava?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWorldWs(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorldWs(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldWs() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWorldWs(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWorldWs(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWorldWs(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldWsPort")
    public HelloWorld getHelloWorldWsPort() {
        return super.getPort(HelloWorldWsPort, HelloWorld.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldWsPort")
    public HelloWorld getHelloWorldWsPort(WebServiceFeature... features) {
        return super.getPort(HelloWorldWsPort, HelloWorld.class, features);
    }

}
