import java.util.Scanner;

public class Relational_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age to apply");
        int age = input.nextInt();
        if(age >= 18) {
            System.out.println("You are eligile to apply ");
        }
        else {
            System.out.println("You are'nt eligible jaooooo wapis bachee");
        }
    }
}
