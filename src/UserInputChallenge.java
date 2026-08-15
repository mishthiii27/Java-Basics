import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:" );
        String name = input.nextLine();
        System.out.println(" \"welcome " +  name + " to KG Coding\" " );

    }
}
