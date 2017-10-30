
package org.me.auctionweb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.auctionweb package. 
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

    private final static QName _AuctionUser_QNAME = new QName("http://AuctionWeb.me.org/", "auctionUser");
    private final static QName _Bid_QNAME = new QName("http://AuctionWeb.me.org/", "bid");
    private final static QName _BidForAuction_QNAME = new QName("http://AuctionWeb.me.org/", "bidForAuction");
    private final static QName _BidForAuctionResponse_QNAME = new QName("http://AuctionWeb.me.org/", "bidForAuctionResponse");
    private final static QName _GetActiveAuctions_QNAME = new QName("http://AuctionWeb.me.org/", "getActiveAuctions");
    private final static QName _GetActiveAuctionsResponse_QNAME = new QName("http://AuctionWeb.me.org/", "getActiveAuctionsResponse");
    private final static QName _Product_QNAME = new QName("http://AuctionWeb.me.org/", "product");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.auctionweb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuctionUser }
     * 
     */
    public AuctionUser createAuctionUser() {
        return new AuctionUser();
    }

    /**
     * Create an instance of {@link Bid }
     * 
     */
    public Bid createBid() {
        return new Bid();
    }

    /**
     * Create an instance of {@link BidForAuction }
     * 
     */
    public BidForAuction createBidForAuction() {
        return new BidForAuction();
    }

    /**
     * Create an instance of {@link BidForAuctionResponse }
     * 
     */
    public BidForAuctionResponse createBidForAuctionResponse() {
        return new BidForAuctionResponse();
    }

    /**
     * Create an instance of {@link GetActiveAuctions }
     * 
     */
    public GetActiveAuctions createGetActiveAuctions() {
        return new GetActiveAuctions();
    }

    /**
     * Create an instance of {@link GetActiveAuctionsResponse }
     * 
     */
    public GetActiveAuctionsResponse createGetActiveAuctionsResponse() {
        return new GetActiveAuctionsResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuctionUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AuctionWeb.me.org/", name = "auctionUser")
    public JAXBElement<AuctionUser> createAuctionUser(AuctionUser value) {
        return new JAXBElement<AuctionUser>(_AuctionUser_QNAME, AuctionUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AuctionWeb.me.org/", name = "bid")
    public JAXBElement<Bid> createBid(Bid value) {
        return new JAXBElement<Bid>(_Bid_QNAME, Bid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidForAuction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AuctionWeb.me.org/", name = "bidForAuction")
    public JAXBElement<BidForAuction> createBidForAuction(BidForAuction value) {
        return new JAXBElement<BidForAuction>(_BidForAuction_QNAME, BidForAuction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidForAuctionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AuctionWeb.me.org/", name = "bidForAuctionResponse")
    public JAXBElement<BidForAuctionResponse> createBidForAuctionResponse(BidForAuctionResponse value) {
        return new JAXBElement<BidForAuctionResponse>(_BidForAuctionResponse_QNAME, BidForAuctionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveAuctions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AuctionWeb.me.org/", name = "getActiveAuctions")
    public JAXBElement<GetActiveAuctions> createGetActiveAuctions(GetActiveAuctions value) {
        return new JAXBElement<GetActiveAuctions>(_GetActiveAuctions_QNAME, GetActiveAuctions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveAuctionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AuctionWeb.me.org/", name = "getActiveAuctionsResponse")
    public JAXBElement<GetActiveAuctionsResponse> createGetActiveAuctionsResponse(GetActiveAuctionsResponse value) {
        return new JAXBElement<GetActiveAuctionsResponse>(_GetActiveAuctionsResponse_QNAME, GetActiveAuctionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AuctionWeb.me.org/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

}
