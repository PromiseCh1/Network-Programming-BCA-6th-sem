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
import java.io.*;
public class URLConnection {
    public static void main(String[] args)throws Exception {
        URL url = new URL("https://www.promise.com.np");
        HttpURLConnection con =(HttpURLConnection) url.openConnection();
        con.connect();
        
         System.out.println("URL Connection Successfull");
        
        
        
        
        
        
    }

    static String guessContentTypeFromName(String imagejpg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static String guessContentTypeFromStream(ByteArrayInputStream bis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
