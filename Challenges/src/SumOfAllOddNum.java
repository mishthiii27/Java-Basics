import java.util.Scanner;

public class SumOfAllOddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter the specified number N");
        int num = input.nextInt();
        sumOfAllOddNo(num);
    }

    public static void sumOfAllOddNo(int num) {
        int i = 1;  //initialization
        int sum = 0;
        while (i <= num) { //condition

            if (i % 2 != 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
// program to summ all odd numbers from 1 to an specified number N