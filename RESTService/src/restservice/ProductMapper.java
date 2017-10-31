/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restservice;

import java.util.HashMap;

/**
 *
 * @author Åsmund
 */
public class ProductMapper {
    
    public static String findProducts(String xml){
                
        String output = "";
        
        String a = xml;
        a = a.split("<products>")[1];
        
        String[] products = a.split("<product>");
        for(int i = 1; i < products.length; i++){
            int id = Integer.parseInt(products[i].split("<id>")[1].split("</id>")[0]);
            String name = products[i].split("<name>")[1].split("</name>")[0];
            String description = products[i].split("<description>")[1].split("</description>")[0];
            double price = Double.parseDouble(products[i].split("<startingPrice>")[1].split("</startingPrice>")[0]);
            //String expirationDate = products[i].split("<expirationDate>")[1].split("</expirationDate>")[0];
            
            output += ("Product name: " + name + ", Product id: " + id + "\n"); 
         
            
        }
        
        return output;
    }
    
    public static HashMap map(String xml){
        
        
        HashMap<Integer, String> theMap = new HashMap();
        
        String a = xml;
        a = a.split("<products>")[1];
        
        String[] products = a.split("<product>");
        for(int i = 1; i < products.length; i++){
            int id = Integer.parseInt(products[i].split("<id>")[1].split("</id>")[0]);
            
            double price = Double.parseDouble(products[i].split("<startingPrice>")[1].split("</startingPrice>")[0]);
           
            
            theMap.put(id, "Highest bid: " + price + "\n");
        }
        
        return theMap;
        
    }
    
    
}
