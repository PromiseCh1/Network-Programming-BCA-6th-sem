import java.io.*;
import java.net.*;
import java.util.Scanner;

public class HttpGETProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter age: ");
        String age = sc.nextLine();
        
        System.out.print("Enter city: ");
        String city = sc.nextLine();
        
        // Build URL with parameters
        String url = "http://localhost/lab3_api/test.php?" +
                    "name=" + URLEncoder.encode(name) +
                    "&age=" + URLEncoder.encode(age) +
                    "&city=" + URLEncoder.encode(city);
        
        // Send GET request
        String response = sendGetRequest(url);
        System.out.println("\nServer Response:\n" + response);
        
        sc.close();
    }
    
    public static String sendGetRequest(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            // Read response
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line).append("\n");
            }
            br.close();
            
            return response.toString();
            
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}