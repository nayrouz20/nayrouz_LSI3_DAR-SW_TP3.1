package app;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
public static void main(String[] args) {
try {
Socket socket = new Socket("localhost", 1234);

String output = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();

System.out.println(output);

socket.close();

} catch (IOException e) {
e.printStackTrace();
}

}
}