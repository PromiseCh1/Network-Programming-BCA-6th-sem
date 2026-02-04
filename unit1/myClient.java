/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit1;

/**
 *
 * @author promise
 */
import java.io.*;
import java.net.*;

public class myClient {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("Localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("hello Server");
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
