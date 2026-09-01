import java.util.Scanner;

public class ProductOfFlaotingNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A");
        System.out.println("ENTER B");
        float A = input.nextFloat();
        float B = input.nextFloat();

        System.out.println("the product is:" + (A*B));
    }
}
