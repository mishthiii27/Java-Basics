import java.util.Scanner;

public class SimpleInterest {
       public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter P  ");
            System.out.println("Enter R ");
            System.out.println("Enter T ");
            int P = input.nextInt();
            int R = input.nextInt();
            int T = input.nextInt();

            int SI= ((P*R*T)/100);
            System.out.println("The SI is:" + SI);
        }
    }


