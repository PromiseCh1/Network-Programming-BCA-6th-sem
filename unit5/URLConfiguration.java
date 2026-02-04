/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit5;

/**
 *
 * @author promise
 */
import java.net.*;

public class URLConfiguration {
    public static void main(String[] args)throws Exception {
        
    
            URL url = new URL("https://www.promise.com.np");
        HttpURLConnection con= (HttpURLConnection) url.openConnection();
        con.connect();
        
        
        System.out.println(con.getURL());
         System.out.println(con.getUseCaches());
          System.out.println(con.getDoOutput());
}
}
