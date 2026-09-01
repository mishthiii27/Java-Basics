import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number to check prime or not ");
        int num = input.nextInt();
        int result = isPrime(num);//method calls that returns true or false
        System.out.println("THE REVERSED NUM IS" +  result);
    }
    public static boolean isPrime(int num){

    }
}
