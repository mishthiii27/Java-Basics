import java.util.Scanner;

public class ReeverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = input.nextInt();
        int result = isPalindome(num);//method calls that returns true or false
        System.out.println("THE REVERSED NUM IS" +  result);
    }

    public static int isPalindome(int num) {

        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }
}

