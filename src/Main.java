import java.util.*;

public class Main {
    public static void main(String args[]){
        Game game = new Game();

        String choice = game.getChoice();

        while(choice.equals("y")){
            System.out.println("Lets begin! Choose rock, paper or scissors (r,p,s):");
            // ask user his choice
            String userChoice = new User().getChoice();
            // get computers choice
            String compChoice = new CompPlayer().getChoice();
            // compare both and announce results
            game.play(userChoice, compChoice);
            // ask user if they want to play again
            choice = game.getChoice();
        }

        System.out.println("Thank you for playing!");


    }
}
