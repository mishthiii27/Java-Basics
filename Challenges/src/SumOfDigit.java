import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = input.nextInt();
        SumOfDigitCalculation(num);
    }

    public static void SumOfDigitCalculation(int num) {
        int sum = 0;
        while( num >0 ){
                  int digit = num % 10; //extract last digit 13%10 = 3
             sum = sum + digit; // add to sum
            num = num / 10; //remove last digit i.e  13/ 10 = 1
                }
        System.out.println(sum);
    }

}
