import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a side ");
        System.out.println("Enter b side ");
        System.out.println("Enter c side ");
        System.out.println("Enter d side ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float d = input.nextFloat();
        System.out.println("perimeter of the rectangle is: " + (a+b+c+d));
    }
}
