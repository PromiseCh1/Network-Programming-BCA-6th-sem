/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4;

/**
 *
 * @author promise
 */
import java.net.*;
import java.util.List;

public class CookieEx {
    public static void main(String[] args) throws Exception{
        
        //setting up the Cookie
        CookieManager manager = new CookieManager();
        manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(manager);
        
        //set URI
        URI uri = new URI("https://www.promise.com.np");
        
        //Create HTTPCookie
        HttpCookie cookie = new HttpCookie("promise_cookie","value");
        
        //setCookie Attributes
        cookie.setDomain("https://www.promise.com.np");
        
        
        //add cookie to cookie Store
        CookieStore store = manager.getCookieStore();
        store.add(uri,cookie);
        
        System.out.println("Cookie Added");
        
        
        //reading cookie
        System.out.println("Cookie Stored in URI:");
        
        List<HttpCookie> cookies= manager.getCookieStore().get(uri);
        
        for(HttpCookie c :cookies){
            System.out.println("Name: "+c.getName()+"\t, Value: "+c.getValue());
        }
        
    }
}
