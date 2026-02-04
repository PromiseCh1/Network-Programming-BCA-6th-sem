/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit3;

/**
 *
 * @author promise
 */
import java.net.URLEncoder;
import java.net.URLDecoder;
public class URLEncoding_Decoding {
    public static void main(String[] args) {
        try{
        
            String text1 = "Hello Promise @ ";
            String encode = URLEncoder.encode(text1, "UTF-8");
            System.out.println("Orginal: "+text1);
            System.out.println("Encoded:"+encode);
            
            String decode = URLDecoder.decode(encode,"UTF-8");
            System.out.println("Decoded: "+decode);
        
        }catch(Exception e){
            System.out.println(e);}
    }
}
