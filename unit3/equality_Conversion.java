package unit3;

import java.net.*;

public class equality_Conversion {
    public static void main(String[] args) {  // REMOVE throws from here
        try {
            URL u1 = new URL("https://www.promise.com#top");
            URL u2 = new URL("https://www.promise.com#1");
             
            System.out.println("Equals method: " + u1.equals(u2)); // false
            System.out.println("SameFile method: " + u1.sameFile(u2)); // true

            // Another example
            URL u3 = new URL("https://www.promise.com#top");
            URL u4 = new URL("https://www.promise.com#1");
            System.out.println("SameFile (u3 & u4): " + u3.sameFile(u4)); // true
        
            System.out.println("=========================CONVERSION=============================");
            URL u5 = new URL("https://www.promise.com:8080/path/file.html?name=john#section1");
            System.out.println("Conversion URL to string: " + u5.toString());
        
           
            
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }
}