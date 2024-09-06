import java.net.*;
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
            out.write("Happy new semester!\n");
            out.flush();
            System.out.println("Has sent message!");
            String answer = in.readLine();
            System.out.println(answer);
            out.close();
            in.close();
        } catch (Exception e) {
            System.out.println("Exception thrown " + e);
        }
    }
}