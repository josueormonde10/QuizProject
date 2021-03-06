package org.academiadecodigo.bitjs;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private static final int DEFAULT_PORT = 8000;
    private ServerSocket serverSocket;


    public void start(){
        listen();
    }

    private void listen(){

        try {
            serverSocket = new ServerSocket(DEFAULT_PORT);
            serve(serverSocket);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void serve(ServerSocket serverSocket){

        ExecutorService fixedPool = Executors.newFixedThreadPool(2);
        System.out.println("Waiting for a Player...");

        while(true) {
            try {

                Socket clientSocket = serverSocket.accept();

                fixedPool.submit(new Question(clientSocket));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
