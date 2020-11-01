package org.academiadecodigo.bitjs;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Question implements Runnable {

    Prompt prompt;
    PrintWriter socketWriter;
    Socket clientSocket;

    public Question(Socket clientSocket) throws IOException {
        prompt = new Prompt(clientSocket.getInputStream(), new PrintStream(clientSocket.getOutputStream()));
        socketWriter = new PrintWriter(clientSocket.getOutputStream());
        this.clientSocket = clientSocket;

    }


    public void start() {
        initMenu();
    }

    public void initMenu() {

        socketWriter.println("\n\n");
        socketWriter.flush();
        socketWriter.println(ServerMessage.TITLE);
        socketWriter.println("\n" + ServerMessage.GRAVURE);
        socketWriter.flush();
        String[] options = {ServerMessage.START, ServerMessage.EXIT};
        MenuInputScanner scanner = new MenuInputScanner(options);

        scanner.setMessage(ServerMessage.GAME_MENU);
        int menuIndex = prompt.getUserInput(scanner);

        if (menuIndex == 1) {
            question1();
        }
        if (menuIndex == 2) {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void question1() {
        socketWriter.println(ServerMessage.BEER);
        socketWriter.println(ServerMessage.Q1_INTRO);
        socketWriter.flush();

        String[] options = {ServerMessage.Q1_OPTION1, ServerMessage.Q1_OPTION2};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage(ServerMessage.QUESTION1);

        int question1Index = prompt.getUserInput(scanner);

        if (question1Index == 1) {
            socketWriter.println(ServerMessage.Q1_RIGHT_ANSWER);
            socketWriter.flush();
            question2();
        }
        if (question1Index == 2) {
            socketWriter.println(ServerMessage.Q1_WRONG_ANSWER);
            socketWriter.flush();
            restart();
        }
    }

    public void question2() {
        socketWriter.println(ServerMessage.DRESS);
        socketWriter.flush();
        socketWriter.println(ServerMessage.Q2_INTRO);
        socketWriter.flush();

        String[] options = {ServerMessage.Q2_OPTION1, ServerMessage.Q2_OPTION2};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage(ServerMessage.QUESTION2);

        int question2Index = prompt.getUserInput(scanner);

        if (question2Index == 1) {
            socketWriter.println(ServerMessage.Q2_RIGHT_ANSWER);
            socketWriter.flush();
            question3();
        }
        if (question2Index == 2) {
            socketWriter.println(ServerMessage.Q2_WRONG_ANSWER);
            socketWriter.flush();
            restart();
        }
    }

    public void question3() {
        socketWriter.println(ServerMessage.LAKE);
        socketWriter.println(ServerMessage.Q3_INTRO);
        socketWriter.flush();

        String[] options = {ServerMessage.Q3_OPTION1, ServerMessage.Q3_OPTION2};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage(ServerMessage.QUESTION3);

        int question3Index = prompt.getUserInput(scanner);

        if (question3Index == 2) {

            socketWriter.println(ServerMessage.Q3_RIGHT_ANSWER);
            socketWriter.flush();
            question4();
        }
        if (question3Index == 1) {
            socketWriter.println(ServerMessage.Q3_WRONG_ANSWER);
            socketWriter.flush();
            lose();
        }
    }

    public void question4() {

        socketWriter.println(ServerMessage.SWORD);
        socketWriter.println(ServerMessage.Q4_INTRO);
        socketWriter.flush();

        String[] options = {ServerMessage.Q4_OPTION1, ServerMessage.Q4_OPTION2};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage(ServerMessage.QUESTION4);

        int question4Index = prompt.getUserInput(scanner);

        if (question4Index == 2) {

            socketWriter.println(ServerMessage.Q4_RIGHT_ANSWER);
            socketWriter.flush();
            question5();
        }
        if (question4Index == 1) {
            socketWriter.println(ServerMessage.Q4_WRONG_ANSWER);
            socketWriter.flush();
            lose();
        }

    }

    public void question5() {

        socketWriter.println(ServerMessage.FLOWER);
        socketWriter.println(ServerMessage.Q5_INTRO);
        socketWriter.flush();

        String[] options = {ServerMessage.Q5_OPTION1, ServerMessage.Q5_OPTION2};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage(ServerMessage.QUESTION5);

        int question5Index = prompt.getUserInput(scanner);

        if (question5Index == 1) {

            socketWriter.println(ServerMessage.Q5_RIGHT_ANSWER);
            socketWriter.flush();
            question6();
        }
        if (question5Index == 2) {
            socketWriter.println(ServerMessage.Q5_WRONG_ANSWER + "\n" + "Choose wisely next time.");
            socketWriter.flush();
            restart();

        }
    }

    public void question6() {
        socketWriter.println(ServerMessage.ARC);
        socketWriter.println(ServerMessage.Q6_INTRO);
        socketWriter.flush();

        String[] options = {ServerMessage.Q6_OPTION1, ServerMessage.Q6_OPTION2};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage(ServerMessage.QUESTION6);

        int question6Index = prompt.getUserInput(scanner);

        if (question6Index == 1) {

            socketWriter.println(ServerMessage.Q6_RIGHT_ANSWER);
            socketWriter.flush();
            restart();
        }
        if (question6Index == 2) {
            socketWriter.println(ServerMessage.Q6_WRONG_ANSWER);
            socketWriter.flush();
            restart();
        }
    }

    public void lose() {
        socketWriter.println(ServerMessage.LOSE);
        socketWriter.flush();
        restart();
    }

    public void win() {
        socketWriter.println(ServerMessage.WIN);
        socketWriter.flush();
    }

    public void restart() {
        String[] options = {ServerMessage.RESTART, ServerMessage.QUIT};
        MenuInputScanner scanner = new MenuInputScanner(options);

        scanner.setMessage(ServerMessage.R_QUESTION);
        int answerIndex5 = prompt.getUserInput(scanner);

        if (answerIndex5 == 1) {
            initMenu();
        }
        if (answerIndex5 == 2) {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        start();
    }
}
