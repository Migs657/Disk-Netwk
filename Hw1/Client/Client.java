import java.net.*;
import java.util.Scanner;
import java.io.*;
import javax.net.SocketFactory;
import javax.net.ssl.*;
//import java.security.KeyStore;

public class Client {
    public static void main(String args[]) {
        int port = 2024;
        try {
            // tell the system who we trust
            System.setProperty("javax.net.ssl.trustStore", "ds.truststore");
            System.setProperty("javax.net.ssl.trustStorePassword", "password");
            // get an SSLSocketFactory
            SocketFactory sf = SSLSocketFactory.getDefault();
            // an SSLSocket "is a" Socket
            Socket s = sf.createSocket("localhost", port);
            PrintWriter out = new PrintWriter(s.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            Scanner input = new Scanner(System.in);
            String msg;
            System.out.println("Type 1 to ask Serrver for current time\n \nType 2 to ask Server for IP of lacal");            
            msg = input.nextLine();
            //System.out.println("Message sent: " + msg);
            out.write(msg + "\n");
            out.flush();
            //System.out.println("Has sent message!");
            String answer = in.readLine();
            System.out.println(answer);
            input.close();
            out.close();
            in.close();
        } catch (Exception e) {
            System.out.println("Exception thrown " + e);
        }
    }
}