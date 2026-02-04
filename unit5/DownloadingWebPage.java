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
import java.io.*;

public class DownloadingWebPage {

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.promise.com.np");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.connect();

        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line;
        StringBuilder content = new StringBuilder();

        while ((line = br.readLine()) != null) {
            content.append(line);
        }
        
        FileWriter out = new FileWriter("webDownload.html");
        out.write(content.toString());
        out.close();
        
        con.disconnect();

    }
}
