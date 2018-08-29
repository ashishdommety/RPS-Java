import java.util.Random;

public class CompPlayer {
    // computers game play goes here
    public String getChoice(){
        String[] compOptions = {"r","s","p"};
        Random rand = new Random();
        int n = rand.nextInt(3);
        String compChoice = compOptions[n];

        return compChoice;
    }

}
