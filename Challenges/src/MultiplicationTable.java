import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number for which you want table");
        int num = input.nextInt();
        Table(num);
    }

    public static void Table(int num) {
        int i = 1;
        while (i <= 10) {

            System.out.println((num) + " X " + i + " = " +  (num * i));
            i++;
        }
    }
}
//program to print the table of a entered number
