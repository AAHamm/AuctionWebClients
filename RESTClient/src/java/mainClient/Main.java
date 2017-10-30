/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClient;

import auctionwebsoapclient.ProductListener;
import java.util.List;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.InitialContext;
import soapWS.AuctionWebBidWS;
import soapWS.AuctionWebBidWS_Service;
import soapWS.Product;

/**
 *
 * @author Åsmund
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AuctionWebBidWS_Service factory = new AuctionWebBidWS_Service();
        AuctionWebBidWS service = factory.getAuctionWebBidWSPort();
        
       List<Product> products = service.getActiveAuctions();
       
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
              
            ProductListener listener=new ProductListener();
            receiver.setMessageListener(listener);  
            
           products.remove(listener.getProduct());
                          
            System.out.println("Subscriber1 is ready, waiting for messages...");
            System.out.println("press Ctrl+c to shutdown...");  
            while(true){                  
                Thread.sleep(1000);  
            }  
        }catch(Exception e){System.out.println(e);}
    }
    
}
  