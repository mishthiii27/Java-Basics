import java.util.Scanner;

public class BITWISE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first num");
        int first = input.nextInt();
        System.out.println("Enter the second num");
        int second = input.nextInt();

        int a = first & second;
        System.out.println("BITWISE AND" + (a));
        int b = first | second;
        System.out.println("Biwise OR" + (b));
        int c = first;
        System.out.println("BITWISE XOR" + (c));
        int d = ~first;
        System.out.println("BITWISE NOT" + (d));
    }
}
