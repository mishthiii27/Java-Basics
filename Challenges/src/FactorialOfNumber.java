import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number for which you want factorial");
        int num = input.nextInt();
        factorialCalculation(num);
    }

    public static void factorialCalculation(int num) {
        int i = 1; //initialization
        int fact = 1;
        while (num >= i) { //condition
            fact = fact * i;  //working
            i++;
        }
        System.out.println(fact);
    }

}
