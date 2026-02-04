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

public class RetrievingArbitraryHeaderEx2 {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.promise.com.np");
        HttpURLConnection con= (HttpURLConnection) url.openConnection();
        con.connect();
        
        //Method 1: Calling by Direct names
        System.out.println("Method 1: Get arbitrary header using names");
        System.out.println("Content-length"+con.getHeaderField("Content-Length"));
         System.out.println("Content-Type"+con.getHeaderField("Content-Type"));
          System.out.println("Server: "+con.getHeaderField("Server"));
          System.out.println("Connection: "+con.getHeaderField("Connection"));
          
          
          //Method 2: Using index
          System.out.println("Method 2: Get arbitrary header using Index");
//          int i=1;
//          String HeaderKey;
//          
//        while ((HeaderKey = con.getHeaderFieldKey(i)) != null) {
//            String HeaderValue = con.getHeaderField(i);
//            System.out.println(i+". "+" "+HeaderValue+"  : "+HeaderKey);
//            i++;
//        }
//        

            for(int i = 1; i<=8;i++){
                System.out.println(con.getHeaderField(i)+" = "+con.getHeaderFieldKey(i));
            
            }
           
        
    }
}
