import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);
        System.out.println("pls enter the number: ");
        int num = inpu.nextInt();

        if (num % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}