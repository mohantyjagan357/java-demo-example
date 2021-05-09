package clientServer.multiThreadedCS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
        System.out.println("I am connected to the server.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        Scanner sc = new Scanner(System.in);
        String msg;

        do{
            System.out.println("Enter a message you want to send :- ");
            msg = sc.nextLine();
            out.println(msg);
            String response = in.readLine();
            System.out.println(response);
        }while (!msg.equals("exit"));
    }
}
