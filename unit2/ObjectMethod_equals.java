/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit2;

import java.net.*;

public class ObjectMethod_equals {

    public static void main(String[] args) throws UnknownHostException {

        try {
            InetAddress addr = InetAddress.getByName("promise.com.np");
            System.out.println("ip " + addr.getHostAddress());
            System.out.println("hash"+addr.hashCode());
            System.out.println(addr.toString());
            
            
            System.out.println("============================");
            InetAddress addr2 = InetAddress.getByName("www.promise.com.np");
            System.out.println("ip " + addr2.getHostAddress());

            if (addr.equals(addr2)) {

                System.out.println("Same");
            } else {
                System.out.println("Different");
            }

        } catch (UnknownHostException e) {
            System.out.println(e);

        }

    }
}
