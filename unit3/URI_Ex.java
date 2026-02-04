/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit3;

/**
 *
 * @author promise
 */
import java.net.*;
public class URI_Ex {
    public static void main(String[] args)throws URISyntaxException {
        
        URI u1 = new URI("abc://userinfo:password@example.com:8008/students/profile.php?id=3#top");

        System.out.println(u1);
        System.out.println("Scheme:" + u1.getScheme());
        System.out.println("Authority:" + u1.getAuthority());
        System.out.println("UserInfo: " + u1.getUserInfo());
        System.out.println("Path:" + u1.getPath());
        System.out.println("Query:" + u1.getQuery());
        System.out.println("Ref:" + u1.getRawFragment());
        System.out.println("\n=================================");
        URI u2 = new URI("URN:ISBN:0-123-4567-9999-12");
        
        System.out.println(u2);
        System.out.println("Scheme:" + u2.getScheme());
        System.out.println("Authority:" + u2.getAuthority());
        System.out.println("UserInfo: " + u2.getUserInfo());
        System.out.println("Path:" + u2.getPath());
        System.out.println("Query:" + u2.getQuery());
        System.out.println("Ref:" + u2.getRawFragment());
        
    }
}
