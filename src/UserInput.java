import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        System.out.println("Enter age:");
        System.out.println("Enter Yes:");
        String name = input.nextLine();
         int age = input.nextInt();
        String Choice = input.next();
        System.out.println("my name is " + name);
        System.out.println("I am " + age);
        System.out.println(Choice);
    }
}
