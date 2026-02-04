/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit3;

/**
 *
 * @author promise
 */
import java.net.MalformedURLException;
import java.net.URL;
public class URL_Splitting {
    public static void main(String[] args)throws MalformedURLException {
        
        URL url = new URL("https://www.promise.com.np:8008/students/profile.php?id=2#top");
        
        System.out.println("Url Protocol:" + url.getProtocol());
        System.out.println("Url Hostname:" + url.getHost());
        System.out.println("Url file:" + url.getFile());
        System.out.println("Url port:" + url.getPort());
        System.out.println("Url Path:" + url.getPath());
        System.out.println("Url Query:" + url.getQuery());
        System.out.println("Url Fragment:" + url.getRef());
        
        
    }
}
