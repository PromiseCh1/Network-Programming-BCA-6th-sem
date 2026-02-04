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
public class ipv4_ipv6 {
    public static void main(String[] args)throws UnknownHostException {
        try{
        
              InetAddress[] ips = InetAddress.getAllByName("www.google.com");
              
              for(InetAddress ip:ips){
              
                  if(ip instanceof Inet4Address){
                      System.out.println("Ipv4:"+ip.getHostAddress());
                  }
                  else if(ip instanceof Inet6Address){
                      System.out.println("Ipv6:"+ip.getHostAddress());
                  }
              
              
              }
              
        }catch(UnknownHostException e){
            System.out.println(e);}
    }
}
