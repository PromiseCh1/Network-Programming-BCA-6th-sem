/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit2;

/**
 *
 * @author promise
 */
import java.net.*;
public class Q1_address {
    public static void main(String[] args)throws UnknownHostException {
        try{
        InetAddress addr = InetAddress.getByName("www.promise.com.np");
        
            byte[] check = addr.getAddress();
            if (check.length == 4) {
                System.out.println("4");
            } else {
                System.out.println("6");
            }
            System.out.println("Ip : "+addr.getHostAddress());
       
            System.out.println("Host Name:"+addr.getHostName());
            System.out.println("Canonical Name:"+addr.getCanonicalHostName());
            
            
            System.out.println("=====================");
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Local Host :"+ip);
            System.out.println("Local Host Name:"+ip.getHostName());
            
      
            
            
            System.out.println("Is Wild Card Address:"+ip.isAnyLocalAddress());
            System.out.println("Is LoopBack Address: "+ip.isLoopbackAddress());
            System.out.println("Is site local Address:"+ip.isSiteLocalAddress());
            System.out.println("Is Multicast address:"+ip.isMulticastAddress());
            System.out.println("Is Global Multicast Address"+ip.isMCGlobal());
            
            
            
            
        }
        catch(UnknownHostException e){
            System.out.println(e);
        }
    }
}
