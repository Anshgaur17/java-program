import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server started...");

        Socket s = ss.accept();
        System.out.println("Client connected");

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String msg = "", reply = "";

        while (!msg.equals("exit")) {

            msg = dis.readUTF();
            System.out.println("Client: " + msg);

            reply = br.readLine();
            dos.writeUTF(reply);
            dos.flush();
        }

        ss.close();
    }
}