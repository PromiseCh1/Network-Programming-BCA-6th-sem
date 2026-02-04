/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit5;

/**
 *
 * @author promise
 */
import java.io.InputStream;
import java.net.*;

public class GuessMIME {
    public static void main(String[] args)throws Exception {
        URL url = new URL("Https://www.promise.com.np");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.connect();
        
        //header - What Server says
        System.out.println("Content Type: "+con.getContentType());
        
        //name - What name says
        System.out.println("Name : "+con.guessContentTypeFromName("image.jpg"));
        
        //Stream - What file Really is
        InputStream is = con.getInputStream();
        System.out.println("Stream:"+con.guessContentTypeFromStream(is));
        
        con.disconnect();
    }
}
