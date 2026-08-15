import java.sql.SQLOutput;
import java.util.Scanner;

public class AddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first num: ");
        System.out.println("Enter second  num: ");
        int firstNum = input.nextInt();
        int SecNum = input.nextInt();
        int sum = firstNum + SecNum;
        System.out.println("The sum is:" + sum);
    }
}
