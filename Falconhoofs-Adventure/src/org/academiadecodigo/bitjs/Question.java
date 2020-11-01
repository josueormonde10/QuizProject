package org.academiadecodigo.bitjs;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class Question {

    Prompt prompt;

    public Question() {
        prompt = new Prompt(System.in, System.out);

    }

    public static void main(String[] args) {

        Question question = new Question();
        question.start();

    }

    public void start() {
        initMenu();
    }

    public void initMenu() {

        System.out.println(" ");
        System.out.println(ServerMessage.WELCOME);
        String[] options = {ServerMessage.START, ServerMessage.EXIT};
        MenuInputScanner scanner = new MenuInputScanner(options);

        scanner.setMessage(ServerMessage.GAME_MENU);
        int menuIndex = prompt.getUserInput(scanner);

        if (menuIndex == 1) {
            question1();
        }
        if (menuIndex == 2) {
            System.exit(0);
        }

    }

    public void question1() {

        System.out.println(ServerMessage.Q1_INTRO);

        String[] options = {ServerMessage.Q1_OPTION1, ServerMessage.Q1_OPTION2};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage(ServerMessage.QUESTION1);

        int question1Index = prompt.getUserInput(scanner);

        if (question1Index == 1) {
            System.out.println(ServerMessage.Q1_RIGHT_ANSWER);
            question2();
        }
        if (question1Index == 2) {
            System.out.println(ServerMessage.Q1_WRONG_ANSWER);
            lose();
        }
    }

    public void question2() {

        System.out.println(ServerMessage.Q2_INTRO);

        String[] options = {ServerMessage.Q2_OPTION1, ServerMessage.Q2_OPTION2};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage(ServerMessage.QUESTION2);

        int question2Index = prompt.getUserInput(scanner);

        if (question2Index == 1) {
            System.out.println(ServerMessage.Q2_RIGHT_ANSWER);
            question3();
        }
        if (question2Index == 2) {
            System.out.println(ServerMessage.Q2_WRONG_ANSWER);
            lose();
        }
    }

    public void question3() {

        System.out.println(ServerMessage.Q3_INTRO);

        String[] options = {ServerMessage.Q3_OPTION1, ServerMessage.Q3_OPTION2};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage(ServerMessage.QUESTION3);

        int question3Index = prompt.getUserInput(scanner);

        if (question3Index == 2){

            System.out.println(ServerMessage.Q3_RIGHT_ANSWER);
            question4();
        }
        if (question3Index == 1){
            System.out.println(ServerMessage.Q3_WRONG_ANSWER);
            lose();
        }
    }

    public void question4() {

        System.out.println(ServerMessage.Q4_INTRO);

        String[] options = {ServerMessage.Q4_OPTION1, ServerMessage.Q4_OPTION2};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage(ServerMessage.QUESTION4);

        int question4Index = prompt.getUserInput(scanner);

        if (question4Index == 1){

            System.out.println(ServerMessage.Q4_RIGHT_ANSWER);
            question5();
        }
        if (question4Index == 2){
            System.out.println(ServerMessage.Q4_WRONG_ANSWER);
            lose();
        }

    }

    public void question5() {

        System.out.println(ServerMessage.Q5_INTRO);

        String[] options = {ServerMessage.Q5_OPTION1, ServerMessage.Q5_OPTION2};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage(ServerMessage.QUESTION5);

        int question5Index = prompt.getUserInput(scanner);

        if (question5Index == 1){

            System.out.println(ServerMessage.Q5_RIGHT_ANSWER);
            question6();
        }
        if (question5Index == 2){
            System.out.println(ServerMessage.Q5_WRONG_ANSWER);
            lose();
        }
    }

    public void question6() {

        System.out.println(ServerMessage.Q6_INTRO);

        String[] options = {ServerMessage.Q6_OPTION1, ServerMessage.Q6_OPTION2};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage(ServerMessage.QUESTION6);

        int question6Index = prompt.getUserInput(scanner);

        if (question6Index == 1){

            System.out.println(ServerMessage.Q6_RIGHT_ANSWER);
            win();
        }
        if (question6Index == 2){
            System.out.println(ServerMessage.Q6_WRONG_ANSWER);
            lose();
        }
    }

    public void lose() {
        restart();
    }

    public void win(){
        System.out.println(ServerMessage.WIN);
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
            System.exit(0);
        }
    }
}
