package org.academiadecodigo.bitjs;

import java.io.*;
import java.net.Socket;

public class Dealer implements Runnable {

    private Socket clientSocket;

    private BufferedReader terminalInputReader;
    private BufferedWriter terminalOutputWriter;


    public Dealer(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    private void setupSocketStreams (){

        try {
            terminalInputReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            terminalOutputWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    private void dispatch(){

        setupSocketStreams();

        String line = "";

        while (!line.equals("/quit")){

            try {
                line = terminalInputReader.readLine();
                System.out.println(line);

                //terminalOutputWriter.write(line);
                //terminalOutputWriter.newLine();
                terminalOutputWriter.flush();

            }catch (IOException ex){

            }
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        dispatch();
    }
}

