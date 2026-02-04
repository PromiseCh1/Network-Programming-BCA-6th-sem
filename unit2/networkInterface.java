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
import java.util.*;

public class networkInterface {
    public static void main(String[] args)throws UnknownHostException, SocketException {
        try{
            Enumeration n = NetworkInterface.getNetworkInterfaces();
            while (n.hasMoreElements())
            {
                System.out.println(n.nextElement());
            }
            
        
        
        
        }catch(SocketException e){
            System.out.println(e);}
        
    }
}
