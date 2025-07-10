import java.io.*;
import java.net.*;

public class FileSenderClient {

    public static void main(String[] args) throws IOException {
        String serverAddress = "localhost";
        int port = 5000;
        String filePath = "C:\\Users\\Bhushan lande\\IdeaProjects\\Practice1\\src\\main\\java\\testfile.txt"; // Change to your file path

        Socket socket = new Socket(serverAddress, port);
        System.out.println("[CLIENT] Connected to server at " + serverAddress + ":" + port);

        File file = new File(filePath);
        FileInputStream fileIn = new FileInputStream(file);
        OutputStream out = socket.getOutputStream();


        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = fileIn.read(buffer)) != -1) {
            out.write(buffer, 0, bytesRead);
        }

        System.out.println("[CLIENT] File sent: " + file.getName());

        fileIn.close();
        out.close();

    }
}
