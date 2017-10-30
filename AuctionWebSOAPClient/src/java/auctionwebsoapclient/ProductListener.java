/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auctionwebsoapclient;

import java.util.List;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import org.me.auctionweb.Product;

/**
 *
 * @author Åsmund
 */
public class ProductListener implements MessageListener {
    
    Product product;
    List<Product> currentList;
    
    public ProductListener(List<Product> products){
        this.currentList = products;
    }
    
    public Product getProduct(){
        return product;
    }
    
    @Override
    public void onMessage(Message m) { 
        if (m instanceof ObjectMessage) {
            ObjectMessage objectMessage = (ObjectMessage) m;
            Product p;
            try {
                p = (Product) objectMessage.getObject();
                //System.out.println("following product is received: " + p.getName());
                product = p;
                currentList.remove(p);
                printList();
            } catch (JMSException ex) {
                //Logger.getLogger(ProductListener.class.getName()).log(Level.SEVERE, null, ex);
                
            } 
        }
        else{
            System.out.println("Error recieving product:" + m.toString());
        }
    }

    private void printWonMessage(Product p) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void printList(){
        for(Product p : currentList){
            System.out.println("Auction for: " + p.getName());
            System.out.println("Current highest bid: " + p.getStartingPrice());
            System.out.println("");
        }
    }
    
}
