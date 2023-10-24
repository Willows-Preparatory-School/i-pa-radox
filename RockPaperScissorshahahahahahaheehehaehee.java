import java.util.Scanner;

public class RockPaperScissorshahahahahahaheehehaehee {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Hi! How many real players (people) are playing? ");
        int players = scn.nextInt();
        System.out.print("And how many computers are playing? ");
        int computers = scn.nextInt();
        while(players + computers < 4 || players + computers > 8){
            if(players + computers < 4){
                System.out.println("Sorry, you have named too less players. Even if Rock Paper Scissors is a 2 player game, this version has a minimum of four players.");
                System.out.print("Now, how many real players (people) are playing? ");
                players = scn.nextInt();
                System.out.print("And how many computers are playing? ");
                computers = scn.nextInt();
            }
            else{
                System.out.println("Sorry, you have named too many players. How much patience do you think you have?");
                System.out.print("Now, how many real players (people) are playing? ");
                players = scn.nextInt();
                System.out.print("And how many computers are playing? ");
                computers = scn.nextInt();
            }
        }
    }
}
