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
import java.net.*;
public class URL_OpenConnection {
    
    
    public static void main(String[] args) throws ProtocolException,IOException {
        try{
            
            URL u = new URL("https://www.promise.com.np");
            HttpURLConnection con = (HttpURLConnection)u.openConnection();
            con.setRequestMethod("GET");
            
            BufferedReader br = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
            String line;
            
            while((line= br.readLine())!= null)
            {
                System.out.println(line);
            }
            
            
        }
        catch(MalformedURLException e){
            System.out.println(e);
        }
    }
    
}
