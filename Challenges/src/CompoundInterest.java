import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter P ");
            System.out.println("Enter R ");
            System.out.println("Enter T ");
            float P = input.nextFloat();
            float R = input.nextFloat();
            float T = input.nextFloat();

            double CI= P * Math.pow((1 + R / 100), T);
            System.out.println("The CI is:" + CI);
        }
    }



