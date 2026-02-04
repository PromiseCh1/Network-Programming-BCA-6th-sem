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
public class chatAppServer {
    public static void main(String[] args) {
        try{
            
            ServerSocket ss = new ServerSocket(4444);
            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());

            String msg = (String) dis.readUTF();
            System.out.println("Client msg: " + msg);

            DataOutputStream dout1 = new DataOutputStream(s.getOutputStream());
            dout1.writeUTF("hello Client");

            dout1.flush();
            dout1.close();
//            dis.close();
            ss.close();

        }catch(Exception e){
            System.out.println(e);
        
        }
    }
    
}
