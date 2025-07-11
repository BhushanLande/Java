package javaPrograms;

import java.io.*;
import java.net.*;

public class FileWriterServer {

    public static void main(String[] args) throws IOException {
        int port = 5000; // You can change the port
        String outputFile = "C:\\Users\\Bhushan lande\\IdeaProjects\\Practice1\\src\\main\\java\\javaPrograms\\received_file.txt";

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("[SERVER] Listening on port " + port + "...");

        Socket clientSocket = serverSocket.accept();
        System.out.println("[SERVER] Connected to client: " + clientSocket.getInetAddress());

        InputStream in = clientSocket.getInputStream();
        FileOutputStream fileOut = new FileOutputStream(outputFile);

        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = in.read(buffer)) != -1) {
            fileOut.write(buffer, 0, bytesRead);
        }

        System.out.println("[SERVER] File received and saved as: " + outputFile);

        fileOut.close();
        in.close();
        clientSocket.close();
    }
}
