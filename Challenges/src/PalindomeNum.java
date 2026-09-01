import java.util.Scanner;

public class PalindomeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = input.nextInt();
        boolean result = isPalindome(num); //method calls that returns true or false
        if (result) {
            System.out.println("YES THE NUMBER IS Palindome");
        } else {
            System.out.println("NOT Palindome");
        }
    }
    public static boolean isPalindome(int num){
        int originalnum = num;
        int rev = 0;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
           num =  num / 10;

        }
        if(originalnum == rev){
            return true;
        }
        else{
            return false;
        }
    }
}
