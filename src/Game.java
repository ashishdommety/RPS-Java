import java.util.Scanner;

public class Game {
    private int counter = 0;

    public void play(String user, String com){
        startGame(user, com);
        counter++;
    }

    public String getChoice(){
        if(counter == 0){
            System.out.println("Do you want to play rock, paper, scissors? (y/n)");
        }else{
            System.out.println("\nPlay again? (y/n)");
        }

        Scanner scChoice = new Scanner(System.in);
        String choice = scChoice.next();

        return choice;
    }

    // comparsion logic goes here
    public void startGame(String userChoice, String compChoice){
        System.out.println("Comp chose " + compChoice);
        if(userChoice.equals("r")){
            if(compChoice.equals("r")){
                System.out.println("draw");
            }else if(compChoice.equals("s")){
                System.out.println("You won!");
            }else if(compChoice.equals("p")){
                System.out.println("You lose...");
            }
        }else if(userChoice.equals("s")){
            if(compChoice.equals("s")){
                System.out.println("draw");
            }else if(compChoice.equals("p")){
                System.out.println("You won!");
            }else if(compChoice.equals("r")){
                System.out.println("You lose...");
            }
        }else if(userChoice.equals("p")){
            if(compChoice.equals("p")){
                System.out.println("draw");
            }else if(compChoice.equals("r")){
                System.out.println("You won!");
            }else if(compChoice.equals("s")){
                System.out.println("You lose...");
            }
        }else{
            System.out.println("Sorry, your option is invalid");
        }
    }

    public void endGame(){
        System.out.println("Thank you for playing!");
    }
}

