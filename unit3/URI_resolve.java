/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit3;

/**
 *
 * @author promise
 */
import java.net.URI;
import java.net.URISyntaxException;
public class URI_resolve {
    public static void main(String[] args) throws URISyntaxException{
        URI base = new URI("https://www.promise.com");
        URI relative = new URI("index.html");
        
        URI resolve = base.resolve(relative);
        
        System.out.println("Resolved:"+resolve);
    }
}
