import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 5000);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String msg = "", reply = "";

        while (!msg.equals("exit")) {

            msg = br.readLine();
            dos.writeUTF(msg);
            dos.flush();

            reply = dis.readUTF();
            System.out.println("Server: " + reply);
        }

        s.close();
    }
} 