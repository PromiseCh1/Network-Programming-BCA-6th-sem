/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author promise
 */
public class ReadDataFromServer {
    public static void main(String[] args)throws Exception {

        URL url = new URL("https://www.promise.com.np");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.connect();

        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        con.disconnect();
    }
}
