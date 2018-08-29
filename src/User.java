import java.util.Scanner;

public class User {
    // users game play goes here
    public String getChoice(){

        Scanner sc = new Scanner(System.in);
        String userChoice = sc.next();
        return userChoice;
    }

}
