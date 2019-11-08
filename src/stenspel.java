import java.util.Random;
import java.util.Scanner;

public class stenspel {
    public static void main (String [] args){
        //poäng variabel
        int point = 0;
        int point2 = 0;

        //scanner
        Scanner key = new Scanner(System.in);

        //spelar läge
        System.out.println("would you like to play 1 or 2 players?");
        int antalspelare = key.nextInt();

        //spelet
        if (antalspelare == 1) {

            boolean games = false;

            while (games == false) {
                System.out.println("\nPlease enter rock, papper or scissor" + "\n rock = 1" + "\n papper = 2" + "\n scissor = 3");

                int val = key.nextInt();

                //dator
                int computer = new Random().nextInt(2);
                computer = computer + 1;

                //outcome
                if (computer == 1) {
                    System.out.println("computer choose rock");
                    if (val == 1)
                        System.out.println("you both choose rock! its a tie");
                    if (val == 2) {
                        System.out.println("You choose papper! You won 1 point!");
                        point = point + 1;
                    }
                    if (val == 3) {
                        System.out.println("You choose scissors! You loose, computer gets one point!");
                        point2 = point2 + 1;
                    }
                } else if (computer == 2) {
                    System.out.println("computer choose papper");
                    if (val == 1) {
                        System.out.println("you choose rock! You loose, computer gets one point!");
                        point2 = point2 + 1;
                    }
                    if (val == 2)
                        System.out.println("You choose papper! Its a tie");
                    if (val == 3) {
                        System.out.println("You choose scissors! You won 1 point");
                        point = point + 1;
                    }
                } else if (computer == 3) {
                    System.out.println("computer choose scissors");
                    if (val == 1) {
                        System.out.println("you choose rock! You won 1 point!");
                    }
                    point = point + 1;

                    if (val == 2) {
                        System.out.println("You choose papper! You loose, computer gets one point!");
                        point2 = point2 + 1;
                    }
                    if (val == 3)
                        System.out.println("You choose scissors! Its a tie");

                }

                if (point == 2 || point2 == 2)
                    games = true;
            }
            if (point == 2)
                System.out.println("you won the game! congrats");
            else
                System.out.println("You lost the game! NOOB");
        }

            if (antalspelare == 2) {

                boolean games = false;

                while (games == false) {
                    System.out.println("player 1 " + "\nPlease enter rock, papper or scissor" + "\n rock = 1" + "\n papper = 2" + "\n scissor = 3");

                    int val = key.nextInt();
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n");

                    System.out.println("player 2 " + "\nPlease enter rock, papper or scissor" + "\n rock = 1" + "\n papper = 2" + "\n scissor = 3");
                    int val2 = key.nextInt();
                    System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n");

                    //outcome
                    if (val2 == 1) {
                        System.out.println("player 2 choose rock");
                        if (val == 1)
                            System.out.println("you both choose rock! its a tie");
                        if (val == 2) {
                            System.out.println("Player 1 choose papper! player 1 won 1 point!");
                            point = point + 1;
                        }
                        if (val == 3) {
                            System.out.println("Player 1 choose scissors! Player 2 gets 1 point!");
                            point2 = point2 + 1;
                        }
                    } else if (val2 == 2) {
                        System.out.println("player 2 choose papper");
                        if (val == 1) {
                            System.out.println("player 1 choose rock! Player 2 gets 1 point!");
                            point2 = point2 + 1;
                        }
                        if (val == 2)
                            System.out.println("You both choose papper! Its a tie");
                        if (val == 3) {
                            System.out.println("Player 1 choose scissors! Player 1 won 1 point");
                            point = point + 1;
                        }
                    } else if (val2 == 3) {
                        System.out.println("Player 2 choose scissors");
                        if (val == 1) {
                            System.out.println("Player 1 choose rock! Player 1 won 1 point!");
                            point = point + 1;
                        }

                        if (val == 2) {
                            System.out.println("Player 1 choose papper! Player 2 gets 1 point!");
                            point2 = point2 + 1;
                        }
                        if (val == 3)
                            System.out.println("You both choose scissors its a tie");

                    }

                    if (point == 2 || point2 == 2)
                        games = true;
                }
                if (point == 2)
                    System.out.println("\n" + "Player 1 won the game! player 2 is n00b! xD");
                else
                    System.out.println( "\n" + "Player 2 won the game! player 1 is n00b! xD");
            }
        }

    }
