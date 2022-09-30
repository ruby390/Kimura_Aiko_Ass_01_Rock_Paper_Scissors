import java.util.Scanner;
public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variables
        String playerA = "R";
        String playerB = "P";
        String continueGame = "Y";
        // input player A
        do {
            do {
                System.out.println("Player A, what is your move? Enter R, P, or S.");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) { // ERROR
                }
                else {
                    System.out.println("You said your move was " + playerA);
                    System.out.println("The program will run again; enter a valid amount.");
                }
            } while (playerA.equals("R") || playerA.equals("P") || playerA.equals("S"));
            // input player B
            do {
                System.out.println("Player B, what is your move? Enter R, P, or S.");
                playerB = in.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                }
                else {
                    System.out.println("You said your move was " + playerB);
                    System.out.println("The program will run again; enter a valid amount.");
                }
            } while (playerB.equals("R") || playerB.equals("P") || playerB.equals("S"));
            // if player a is rock:
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Its a tie");
                }
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers rock, player B wins!");
                } else {
                    System.out.println("Rock breaks scissors player A wins!");
                }
            }
            // if player a is paper:
            else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers rock, player A wins!");
                }
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Its a tie.");
                }
                else {
                    System.out.println("scissors cuts paper, player B wins!");
                }
            }
            // if player a is scissors:
            else if (playerA.equalsIgnoreCase("S")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock smashes scissors, player B wins!");
                }
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut paper, player A wins!");
                }
                else {
                    System.out.println("Its a tie.");
                }
            }
            // Continue game?
            System.out.println("Would you like to continue? [Y/N]");
            continueGame = in.nextLine();
        }while(continueGame.equalsIgnoreCase("Y"));
    }
}