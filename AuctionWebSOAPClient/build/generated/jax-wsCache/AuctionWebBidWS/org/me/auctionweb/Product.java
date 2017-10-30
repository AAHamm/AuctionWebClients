
package org.me.auctionweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="seller" type="{http://AuctionWeb.me.org/}auctionUser" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipsTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startingPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="isPublished" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="expirationDate" type="{http://AuctionWeb.me.org/}date" minOccurs="0"/&gt;
 *         &lt;element name="isExpired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "id",
    "seller",
    "name",
    "description",
    "imageURL",
    "shipsTo",
    "startingPrice",
    "isPublished",
    "expirationDate",
    "isExpired",
    "category"
})
public class Product {

    protected Long id;
    protected AuctionUser seller;
    protected String name;
    protected String description;
    protected String imageURL;
    protected String shipsTo;
    protected double startingPrice;
    protected boolean isPublished;
    protected Date expirationDate;
    protected Boolean isExpired;
    protected String category;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionUser }
     *     
     */
    public AuctionUser getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionUser }
     *     
     */
    public void setSeller(AuctionUser value) {
        this.seller = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    /**
     * Gets the value of the shipsTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipsTo() {
        return shipsTo;
    }

    /**
     * Sets the value of the shipsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipsTo(String value) {
        this.shipsTo = value;
    }

    /**
     * Gets the value of the startingPrice property.
     * 
     */
    public double getStartingPrice() {
        return startingPrice;
    }

    /**
     * Sets the value of the startingPrice property.
     * 
     */
    public void setStartingPrice(double value) {
        this.startingPrice = value;
    }

    /**
     * Gets the value of the isPublished property.
     * 
     */
    public boolean isIsPublished() {
        return isPublished;
    }

    /**
     * Sets the value of the isPublished property.
     * 
     */
    public void setIsPublished(boolean value) {
        this.isPublished = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExpirationDate(Date value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the isExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExpired() {
        return isExpired;
    }

    /**
     * Sets the value of the isExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExpired(Boolean value) {
        this.isExpired = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

}
