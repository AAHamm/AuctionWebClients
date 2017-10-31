/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restservice;

import RestCode.RestClient;
import java.util.Scanner;

/**
 *
 * @author Åsmund
 */
public class RESTService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RestClient client = new RestClient();  
        
        System.out.println("getProducts : Get all active products by:");
        System.out.println("getBidFor (productID) : Get Bid for a given product by productId");
        System.out.println("exit : end client");
        
        Scanner reader = new Scanner(System.in);  
        
        while(true){
            
        String a = client.findAll_XML(String.class);
        
        String line = reader.nextLine(); 
        
        String[] partitions = line.split(" ");
        
        if(line.equals("getProducts"))
            System.out.println(ProductMapper.findProducts(a));
        else if(line.equals("exit"))
            break;
        else if(partitions[0].equals("getBidFor"))
            System.out.println(ProductMapper.map(a).get(Integer.parseInt(partitions[1])));
        else
            System.out.println("invalid operation");
    
    }
    reader.close();
        
        
    }
    
}
