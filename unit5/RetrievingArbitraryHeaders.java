package unit5;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.util.Map;
import java.util.List;

public class RetrievingArbitraryHeaders {
    
    public static void main(String[] args) throws Exception {
        
        URL url = new URL("https://www.promise.com.np");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.connect();
        
        
        // ============================================
        // ADDING ARBITRARY HEADERS DEMONSTRATION
        // ============================================
        
        System.out.println("\n=== RETRIEVING ARBITRARY HEADERS ===");
        
        // METHOD 1: Get single arbitrary header by name
        System.out.println("\n1. Single Arbitrary Headers:");
        String server = con.getHeaderField("Server");
        System.out.println("Server: " + server);
        
        String connection = con.getHeaderField("Connection");
        System.out.println("Connection: " + connection);
        
        String cacheControl = con.getHeaderField("Cache-Control");
        System.out.println("Cache-Control: " + cacheControl);
        
        // Try some common headers that don't have specific methods
        String[] commonHeaders = {"ETag", "Vary", "Accept-Ranges", 
                                  "X-Frame-Options", "X-Content-Type-Options"};
        
        System.out.println("\n2. Other Common Headers:");
        for (String header : commonHeaders) {
            String value = con.getHeaderField(header);
            if (value != null) {
                System.out.println(header + ": " + value);
            }
        }
        
        // METHOD 2: Get all headers as Map
        System.out.println("\n3. All Headers (as Map):");
        Map<String, List<String>> allHeaders = con.getHeaderFields();
        
        for (Map.Entry<String, List<String>> entry : allHeaders.entrySet()) {
            String headerName = entry.getKey();
            List<String> headerValues = entry.getValue();
            
            // null key is for the status line
            if (headerName == null) {
                System.out.println("Status: " + headerValues);
            } else {
                System.out.println(headerName + ": " + headerValues);
            }
        }
        
        // METHOD 3: Get headers by index (old-style)
        System.out.println("\n4. Headers by Index:");
        int i = 1;
        String headerKey;
        while ((headerKey = con.getHeaderFieldKey(i)) != null) {
            String headerValue = con.getHeaderField(i);
            System.out.println(i + ". " + headerKey + ": " + headerValue);
            i++;
        }
        
        // METHOD 4: Show difference between specific vs arbitrary
        System.out.println("\n=== COMPARISON ===");
        System.out.println("Specific getContentType(): " + con.getContentType());
        System.out.println("Arbitrary 'Content-Type': " + 
            con.getHeaderField("Content-Type"));
        System.out.println("Are they same? " + 
            con.getContentType().equals(con.getHeaderField("Content-Type")));
        
        // Close connection
        con.disconnect();
    }
}