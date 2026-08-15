import java.util.Scanner;

public class ReturnInFunctions {
    public static void main(String[] args) {
        greet();
        int a = readNumber() +1;  // main method is not incharge nd the responsiblity to tranfereed to the new function made
        int b = readNumber() +2;  // method made can be passed as the value directly to a variable
        int sum = a + b;
        System.out.println("THE SUM IS" + sum);

    }

    public static void greet() {
        System.out.println("Welcome to calculator");
    }         //we can take the number from one function only , it saves time, less code, code reusability

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num = input.nextInt();
        return num; //jaha bhi return statement use ki waha function would end .

    }

}