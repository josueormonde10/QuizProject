package org.academiadecodigo.bitjs;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private static final int DEFAULT_PORT = 8000;
    private ServerSocket serverSocket;



    public Server(){

    }

    private void listen(){

        try {
            serverSocket = new ServerSocket(DEFAULT_PORT);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void serve(ServerSocket serverSocket){

        ExecutorService fixedPool = Executors.newFixedThreadPool(1);
        System.out.println("Waiting for client...");
        try {

            Socket clientSocket = serverSocket.accept();

            fixedPool.submit()

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
