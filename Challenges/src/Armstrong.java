import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = input.nextInt();
        boolean result = isArmstrong(num); //method calls that returns true or false
        if (result) {
            System.out.println("YES THE NUMBER IS ARMSTRONG");
        } else {
            System.out.println("NOT ARMSTRONG");
        }
    }

    public static boolean isArmstrong(int num) {
        int OG = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum =  sum + digit * digit * digit;
            num = num / 10;
        }
        if (sum == OG) {  //because we want to compare with the real num , num variable value is getting updated again and again
            return true;
        } else {
            return false;

        }
    }
}
