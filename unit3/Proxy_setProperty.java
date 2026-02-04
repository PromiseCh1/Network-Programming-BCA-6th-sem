/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit3;
import java.net.*;
import java.io.*;

public class Proxy_setProperty {
    public static void main(String[] args) throws Exception {
        // 1. SET PROXY
        System.setProperty("https.proxyHost", "192.168.1.100");
        System.setProperty("https.proxyPort", "8080");
        
        URL url = new URL("https://www.google.com");
        HttpURLConnection con= (HttpURLConnection)url.openConnection();
        con.connect();
        System.out.println("PRoxy Connected");
    }
}