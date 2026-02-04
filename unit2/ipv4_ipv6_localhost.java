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
public class ipv4_ipv6_localhost {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress[] ips = InetAddress.getAllByName("localhost");
        
               for(InetAddress ip:ips){
               if(ip instanceof Inet6Address){
                   System.out.println("Ipv6:"+ip.getHostAddress());
               }
               
               
               }
               
        
    }
}
