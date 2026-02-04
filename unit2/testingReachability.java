/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit2;

/**
 *
 * @author promise
 */
import java.io.IOException;
import java.net.*;
public class testingReachability {
    public static void main(String[] args)throws UnknownHostException {
        
        try{
            
            InetAddress addr = InetAddress.getByName("www.promise.com.np1");
            
            if(addr.isReachable(3000)){
                
                
                System.out.println("Host is reachable!");
            }
            else{
                System.out.println("UnReachable");
            }
            
        
        }catch(UnknownHostException e){
            System.out.println(e);
        
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
