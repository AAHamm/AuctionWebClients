/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auctionwebsoapclient;

import java.util.List;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.InitialContext;
import javax.xml.ws.WebServiceRef;
import org.me.auctionweb.AuctionWebBidWS;
import org.me.auctionweb.AuctionWebBidWS_Service;
import org.me.auctionweb.Product;

/**
 *
 * @author Åsmund
 */
public class Main {

    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/AuctionWeb/AuctionWebBidWS.wsdl")
    private static AuctionWebBidWS_Service service;

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       List<Product> products = getActiveAuctions();       
        for(Product p : products){
            System.out.println("Auction for: " + p.getName());
            System.out.println("Current highest bid: " + p.getStartingPrice());
            System.out.println("");
        }
        
        method(products);
        
        
        
    }
    

    public static void method(List<Product> products) {
        try {   
            InitialContext ctx=new InitialContext();  
            TopicConnectionFactory f=(TopicConnectionFactory)ctx.lookup("AuctionTopicConnectionFactory");  
            TopicConnection con=f.createTopicConnection();  
            con.start();  
            
            TopicSession ses=con.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);  
            Topic t=(Topic)ctx.lookup("AuctionTopic");    
            TopicSubscriber receiver=ses.createSubscriber(t);  
              
            ProductListener listener=new ProductListener(products);
            receiver.setMessageListener(listener);  
            
            
                          
            System.out.println("Subscriber1 is ready, waiting for messages...");
            System.out.println("press Ctrl+c to shutdown...");  
            while(true){                  
                Thread.sleep(1000);  
            }  
        }catch(Exception e){System.out.println(e);}
    }

    private static String bidForAuction(org.me.auctionweb.Bid arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.me.auctionweb.AuctionWebBidWS port = service.getAuctionWebBidWSPort();
        return port.bidForAuction(arg0);
    }

    private static java.util.List<org.me.auctionweb.Product> getActiveAuctions() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.me.auctionweb.AuctionWebBidWS port = service.getAuctionWebBidWSPort();
        return port.getActiveAuctions();
    }
    
}
  