import java.util.Scanner;

public class stenspel {
    public static void main (String [] args){
        //scanner
        Scanner key = new Scanner(System.in);

        //spelar läge
        System.out.println("would you like to play 1 or 2 players?");
        int antalspel = key.nextInt();

        //spelet
        if (antalspel == 1){
            System.out.println("You are now playing against computer!" + "\nPlease enter rock, papper or scissor" + "\n rock = 1" + "\n papper = 2" + "\n scissor = 3");
            int val = key.nextInt();

        }
        else{

        }

    }
}
