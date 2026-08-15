import java.util.Scanner;

public class LogicalOPerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Are you a female? (true/false) ");
         boolean isFemale = input.nextBoolean();


        if (age < 5 ) {
            System.out.println("The discount will be 75%");
        }
        else if (isFemale  ) {
            System.out.println("discount would be 50% ");

        }
        else if(age > 60 && !isFemale ){
            System.out.println("discount is 25%");
        }
        else {
            System.out.println("no discount for you bitch !!!!!!!");
        }
    }
}
