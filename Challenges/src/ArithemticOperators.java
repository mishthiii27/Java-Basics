import java.util.Scanner;

public class ArithemticOperators {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the first number");
        System.out.println("Enter the second number");
        int FirstNum = input.nextInt();
        int SecondNum = input.nextInt();

        System.out.println("ADD"  + (FirstNum + SecondNum));
        System.out.println(FirstNum - SecondNum);
        System.out.println(FirstNum * SecondNum);
        System.out.println(FirstNum / SecondNum);
        System.out.println(FirstNum % SecondNum);
    }
}
