package org.academiadecodigo.bitjs;

public class ServerMessage {


    //COLORS
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";


    //SEPARATORS
    public static final String SEPARATOR1 = (ANSI_PURPLE +"============================== CHAPTER 1 ==============================" + ANSI_RESET);
    public static final String SEPARATOR2 = (ANSI_PURPLE +"============================== CHAPTER 2 ==============================" + ANSI_RESET);
    public static final String SEPARATOR3 = (ANSI_PURPLE +"============================== CHAPTER 3 ==============================" + ANSI_RESET);
    public static final String SEPARATOR4 = (ANSI_PURPLE +"============================== CHAPTER 4 ==============================" + ANSI_RESET);
    public static final String SEPARATOR5 = (ANSI_PURPLE +"============================== CHAPTER 5 ==============================" + ANSI_RESET);
    public static final String SEPARATOR6 = (ANSI_PURPLE +"============================== CHAPTER 6 ==============================" + ANSI_RESET);
    public static final String SEPARATOR7 = (ANSI_YELLOW +"============================== EPILOGUE ==============================" + ANSI_RESET);

    //MENU
    public static final String TITLE =(ANSI_RED + " __                          _ /        _                      \n"+ ANSI_RESET) +
            (ANSI_RED +"|_  _  |  _  _ __ |_  _  _ _|_    _    |_|    _ __ _|_    __ _ \n" + ANSI_RESET) +
            (ANSI_RED + "|  (_| | (_ (_)| || |(_)(_) |    _>    | |\\_/(/_| | |_|_| | (/_" +ANSI_RESET);
    public static final String GRAVURE = (ANSI_YELLOW +"                              |`-._/\\_.-`|\n" +ANSI_RESET) +
            (ANSI_YELLOW +"                              |    ||    |\n" + ANSI_RESET) +
            (ANSI_RED + "                              |___o()o___|\n" +ANSI_RESET) +
            (ANSI_RED + "                              |__((<>))__|\n" + ANSI_RESET) +
            (ANSI_YELLOW +"                              \\   o\\/o   /\n" + ANSI_RESET) +
            (ANSI_YELLOW +"                               \\   ||   /\n" + ANSI_RESET) +
            (ANSI_YELLOW +"                                \\  ||  /\n" + ANSI_RESET) +
            (ANSI_YELLOW + "                                 '.||.'\n" + ANSI_RESET) +
            (ANSI_YELLOW + "                                   ``" +ANSI_RESET);
    public static final String WELCOME = "WELCOME TRAVELER";
    public static final String START = (ANSI_GREEN+"START"+ANSI_RESET);
    public static final String EXIT =  (ANSI_RED+"EXIT"+ANSI_RESET);
    public static final String GAME_MENU = (ANSI_YELLOW +"GAME MENU: "+ANSI_RESET);


    //QUESTION1
    public static final String BEER = "                                 _.._..,_,_\n" +
            "                                (          )\n" +
            (ANSI_YELLOW + "                                 ]~,\"-.-~~[\n" + ANSI_RESET) +
            (ANSI_YELLOW + "                               .=])' (;  ([\n" + ANSI_RESET) +
            (ANSI_YELLOW + "                               | ]:: '    [\n" + ANSI_RESET) +
            (ANSI_YELLOW + "                               '=]): .)  ([\n" + ANSI_RESET) +
            (ANSI_YELLOW + "                                 |:: '    |\n" + ANSI_RESET) +
            "                                 ~~----~~~~";
    public static final String Q1_INTRO = "You're in a Tavern, the ´Ye Old Hag´. \nAn old man approaches and tells you the legend of the golden cavern, which is filled with riches.\nBut also cautions you about the man eating troll that lives there.\nHe then turns to you and asks if you accept the quest.";

    public static final String Q1_OPTION1 = "Hell yeah!";
    public static final String Q1_OPTION2 = "Oh hell nah!";
    public static final String QUESTION1 = "Do you accept?";
    public static final String Q1_RIGHT_ANSWER = (ANSI_CYAN +"\nYou thank the old man and go on to begin the adventure...  \n"+ANSI_RESET);
    public static final String Q1_WRONG_ANSWER = (ANSI_CYAN +"\nThat's okay. Not everyone is supposed to be an adventurer."+ANSI_RESET);


    //QUESTION2
    public static final String DRESS = (ANSI_CYAN + "                                  ( \\./ )       \n" +ANSI_RESET)+
            (ANSI_CYAN + "                                   \\ : /         \n" +ANSI_RESET) +
            (ANSI_CYAN + "                                   ) : (     \n" +ANSI_RESET) +
            (ANSI_CYAN + "                                  /  :  \\    \n" + ANSI_RESET) +
            (ANSI_CYAN + "                                 /.......\\\n" + ANSI_RESET) +
            (ANSI_CYAN + "                                /………………………\\" + ANSI_RESET);
    public static final String Q2_INTRO = "\nYour first task is to find an adequate weapon. \nBut suddenly you hear a scream of a damsel in distress being pursued by wolves. \nYou want to help her, but you're also in a hurry. ";

    public static final String Q2_OPTION1 = "Help the damsel in distress";
    public static final String Q2_OPTION2 = "Don't help her";
    public static final String QUESTION2 = "Will you help?";
    public static final String Q2_RIGHT_ANSWER = (ANSI_CYAN+"\nYou saved the damsel from the wolves and in gratitude, \nshe tells you about a special sword located in the middle of a river, \nthe river of the dead. \nYou then continue the adventure... \n"+ANSI_RESET);
    public static final String Q2_WRONG_ANSWER = (ANSI_CYAN+"\nYou let the poor women be mauled by the wolves. What's the matter with you?!"+ANSI_RESET);

    //QUESTION3
    public static final String LAKE = (ANSI_BLUE+"                    ________________________________\n" +ANSI_RESET) +
            (ANSI_BLUE +"                     -          -         -       -  \n" + ANSI_RESET) +
            (ANSI_BLUE + "                          --                  --     \n" +ANSI_RESET) +
            (ANSI_BLUE +"                    ---            ---          ---    \n" + ANSI_RESET) +
            (ANSI_BLUE + "                         ----               ----   "+ANSI_RESET);
    public static final String Q3_INTRO = "You arrive at the said lake where you realize there's an island at the center. \nYou prepare yourself to for a swim but then you see a boat near the shore.";

    public static final String Q3_OPTION1 = "Go for a swim! It's hot and the island is not that far away...";
    public static final String Q3_OPTION2 = "Use the boat! Better dry than wet.";
    public static final String QUESTION3 = "What should you do?";
    public static final String Q3_RIGHT_ANSWER = (ANSI_CYAN+"\nYou jump into the boat and row. \nLet's just say the dead don't climb up boats, wink wink. \n\nYou obtain the magical sword and continue the adventure... \n\n"+ANSI_RESET);
    public static final String Q3_WRONG_ANSWER = (ANSI_CYAN+"\nYou quickly realize why they call it the lake of the dead. \nThe dead soon rise from the bottom, grab you and pull you to the darkest depth."+ANSI_RESET);


    //QUESTION4
    public static final String SWORD = "                                |                 \n" +
            (ANSI_RED+"                         [======"+ANSI_RESET)+"|::::::::::::::>\n" +
            "                                |\n" +
            "                                ";
    public static final String Q4_INTRO = "While walking through a forest, you're engaged by a group of thieves. \nBoth you and them get into attack position.";

    public static final String Q4_OPTION1 = "Attack! Attack!";
    public static final String Q4_OPTION2 = "Relax and store your sword.";
    public static final String QUESTION4 = "What do you wanna do?";
    public static final String Q4_RIGHT_ANSWER = (ANSI_CYAN+ "\nThey're actually good guys! Who would've known? \nYou all become best friends and they even help you in your quest, \nfor a short while. \n"+ANSI_RESET);
    public static final String Q4_WRONG_ANSWER = (ANSI_CYAN+ "\nYou dumb ass! It's twelve against one! \nWhat do you think it was gonna happen?!"+ANSI_RESET);

    //QUESTION5
    public static final String FLOWER = (ANSI_CYAN +"                                   __\n" + ANSI_RESET) +
            (ANSI_CYAN + "                                __/  \\__\n" + ANSI_RESET) +
            (ANSI_CYAN +"                               /  \\"+ ANSI_YELLOW+ "__"+ANSI_CYAN+"/  \\"+ANSI_RESET+"\n") +
            (ANSI_CYAN +"                               \\__"+ANSI_YELLOW+"/..\\"+ANSI_CYAN+"__/\n"+ANSI_RESET) +
            (ANSI_CYAN +"                               /  "+ANSI_YELLOW+"\\__/"+ANSI_CYAN+"  \\\n"+ANSI_RESET) +
            (ANSI_CYAN +"                               \\__/  \\__/\n" +ANSI_RESET) +
            (ANSI_CYAN +"                                  \\__/\n"+ ANSI_RESET) +
            (ANSI_GREEN + "                                   ||\n" + ANSI_RESET) +
            (ANSI_GREEN + "                                   ||\n" + ANSI_RESET) +
            (ANSI_GREEN +"                                   ||\n" + ANSI_RESET) +
            (ANSI_GREEN + "                                .'/.'\\.'.\n" + ANSI_RESET) +
            (ANSI_GREEN + "                              ..'.'..'..'.'." + ANSI_RESET);
    public static final String Q5_INTRO = "You walk into a swamp, which reeks of death. everything is ugly, tasteless... \nBut them your attention is dropped by a peculiar flower. \nYou come closer to the flower to investigate it.";

    public static final String Q5_OPTION1 = "Stomp the flower and continue the adventure.";
    public static final String Q5_OPTION2 = "Collect the flower";
    public static final String QUESTION5 = "What do you want to do?";
    public static final String Q5_RIGHT_ANSWER = (ANSI_CYAN+"\nYou asshole! Why would you kill such a pretty flower! \n \n"+ANSI_RESET);
    public static final String Q5_WRONG_ANSWER = (ANSI_CYAN+"\nSorry, you don't have permission to do that in this magical beta. \nChoose wisely next time."+ANSI_RESET);

    //QUESTION6
    public static final String ARC = "                                __________\n" +
            "                               /\\____;;___\\\n" +
            "                              | /         /\n" +
            "                              `. "+(ANSI_YELLOW+"(******* "+ANSI_RESET+".\n") +
            "                               |\\"+(ANSI_YELLOW+"(%*******^"+ANSI_RESET+"\\\n") +
            "                              %| |-%-------|\n" +
            "                             % \\ | %  ))   |\n" +
            "                             %  \\|%________|";
    public static final String Q6_INTRO = "Finally you arrive at your destination! You start walking through the cavern, \nmile after mile, until you reach the end, but you don't see any gold, \nonly the old man. \nYou look confused while asking what is he doing there. \nThe old man replies by laughing maniakly and saying 'my dinner has arrived' while he transforms into a huge beast. \nHe is the troll!";

    public static final String Q6_OPTION1 = "Run out of the cavern, screaming like a little girl.";
    public static final String Q6_OPTION2 = "Let the battle begin!";
    public static final String QUESTION6 = "Quick, what should you do?!";
    public static final String Q6_RIGHT_ANSWER = (ANSI_CYAN+"\nYou pussy! Even my grandma is more courageous than you! Shame..."+ANSI_RESET);
    public static final String Q6_WRONG_ANSWER = (ANSI_CYAN+"\nYou jump and decapitate the troll with only one swing of your sword. \nThat wasn't that hard, was it?\n \n"+ANSI_RESET);
    public static final String Q6_EPILOGUE = "\nFeeling defeated, Falconhoof returns to the Ye Old Hag to drink another yale. \nWhile drinking he is aproached by an asian man dressed in a white robe, with a straw hat and wealding a katana. \nThe man man asks for Falconhoof's help to defeat a black demon, will he accept?\n\n To be continued ==>";

    //LOSE
    public static final String LOSE = (ANSI_RED+"\nYou're dead"+ANSI_RESET);

    //WIN
    public static final String WIN = "WINNER!";

    //RESTART MENU
    public static final String RESTART = (ANSI_GREEN +"YES" +ANSI_RESET);
    public static final String QUIT =(ANSI_RED+"NO"+ANSI_RESET);

    public static final String R_QUESTION = (ANSI_YELLOW+ "WANT TO RESTART?" +ANSI_RESET);

}

