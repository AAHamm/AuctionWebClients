
package org.me.auctionweb;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AuctionWebBidWS", targetNamespace = "http://AuctionWeb.me.org/", wsdlLocation = "http://localhost:8080/AuctionWeb/AuctionWebBidWS?wsdl")
public class AuctionWebBidWS_Service
    extends Service
{

    private final static URL AUCTIONWEBBIDWS_WSDL_LOCATION;
    private final static WebServiceException AUCTIONWEBBIDWS_EXCEPTION;
    private final static QName AUCTIONWEBBIDWS_QNAME = new QName("http://AuctionWeb.me.org/", "AuctionWebBidWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AuctionWeb/AuctionWebBidWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AUCTIONWEBBIDWS_WSDL_LOCATION = url;
        AUCTIONWEBBIDWS_EXCEPTION = e;
    }

    public AuctionWebBidWS_Service() {
        super(__getWsdlLocation(), AUCTIONWEBBIDWS_QNAME);
    }

    public AuctionWebBidWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), AUCTIONWEBBIDWS_QNAME, features);
    }

    public AuctionWebBidWS_Service(URL wsdlLocation) {
        super(wsdlLocation, AUCTIONWEBBIDWS_QNAME);
    }

    public AuctionWebBidWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AUCTIONWEBBIDWS_QNAME, features);
    }

    public AuctionWebBidWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuctionWebBidWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AuctionWebBidWS
     */
    @WebEndpoint(name = "AuctionWebBidWSPort")
    public AuctionWebBidWS getAuctionWebBidWSPort() {
        return super.getPort(new QName("http://AuctionWeb.me.org/", "AuctionWebBidWSPort"), AuctionWebBidWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuctionWebBidWS
     */
    @WebEndpoint(name = "AuctionWebBidWSPort")
    public AuctionWebBidWS getAuctionWebBidWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://AuctionWeb.me.org/", "AuctionWebBidWSPort"), AuctionWebBidWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AUCTIONWEBBIDWS_EXCEPTION!= null) {
            throw AUCTIONWEBBIDWS_EXCEPTION;
        }
        return AUCTIONWEBBIDWS_WSDL_LOCATION;
    }

}
