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
public class myServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss= new ServerSocket(6666);
            Socket s =ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str= (String)dis.readUTF();
            System.out.println("Message="+str);
            ss.close();
    }catch(Exception e){
            System.out.println(e);}
    }
}
