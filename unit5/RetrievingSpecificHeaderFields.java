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
import java.util.Date;
public class RetrievingSpecificHeaderFields {
    
    public static void main(String[] args)throws Exception {
        
        URL url = new URL("https://www.promise.com.np");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.connect();
        
        System.out.println("Retrieving Specific Headers");
        System.out.println("Content Type "+con.getContentType());
        System.out.println("Content Length "+con.getContentLength());
        System.out.println("Content Encoding "+con.getContentEncoding());
        
        System.out.println("Dates\n");
        
        long expiration = con.getExpiration();
        Date e = new Date(expiration);
        System.out.println("Expiration: "+e);
        
        
        long lastModified = con.getLastModified();
        Date lm = new Date(lastModified);
        System.out.println("Expiration: " + lm);
        
        long date= con.getDate();
        Date d= new Date(date);
        System.out.println("Date: "+d);
    }
    
}
