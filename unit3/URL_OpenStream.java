/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit3;

/**
 *
 * @author promise
 */
import java.net.URL;
import java.io.*;

public class URL_OpenStream {
    public static void main(String[] args) {
        
        try {
            URL u = new URL("https://www.promise.com.np");

             BufferedReader br = new BufferedReader(
             new InputStreamReader(u.openStream())
             );
             
             String line;
             while ((line= br.readLine())!= null){
             
                 System.out.println(line);
             }
             br.close();
             
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
