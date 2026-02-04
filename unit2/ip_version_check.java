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
public class ip_version_check {
    public static void main(String[] args)throws UnknownHostException {
        
        try{
            InetAddress ip = InetAddress.getByName("2407:1400:aa33:5f60:6085:ba87:32d1:2cd2");
            
            byte[] addr = ip.getAddress();
            
            if (addr.length == 4){
                System.out.println("Ipv4");
            }
            else{
                System.out.println("Ipv6");
            
            }
        
            
            
        }
        catch(UnknownHostException e){
            System.out.println(e);}
        
    }
    
}
