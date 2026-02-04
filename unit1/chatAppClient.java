/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit1;

/**
 *
 * @author promise
 */
import java.net.*;
import java.io.*;
public class chatAppClient {
    public static void main(String[] args) {
        
        try{

            Socket s = new Socket("localhost", 4444);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            dout.writeUTF("Hello server");



            DataInputStream dis = new DataInputStream(s.getInputStream());
            String msg1 = (String) dis.readUTF();
            System.out.println("Msg from server" + msg1);
            
//            dis.close();
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
