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
import java.net.InetAddress;
public class InetAddress1 {
    public static void main(String[] args)throws UnknownHostException{
        try {
            System.out.println("========================Local Host===================");
            InetAddress ip = InetAddress.getLocalHost();
            
            System.out.println("Local Host:"+ip.getHostAddress());
            System.out.println("Local Host name:"+ip.getHostName());
//            System.out.println("All"+ip.getAll);
            
            System.out.println("=========================Inet Address========================================");
            
            
            InetAddress addr = InetAddress.getByName("www.promise.com.np");
            
            System.out.println("Host name: "+addr.getHostName());
              System.out.println("Host Address: "+addr.getHostAddress());
            System.out.println("Canonical hsot name:"+addr.getCanonicalHostName());
        } catch (UnknownHostException e) {
            System.out.println("Invalid hostname: " + e.getMessage());
            // Output: Unknown host: www.promise.com..np
        }
    }
}
