import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter B side ");
        System.out.println("Enter H side ");
        float B = input.nextFloat();
        float H = input.nextFloat();
        float Area = (0.5f * B * H);
        System.out.println("The area of triangle is:" + Area);
    }
}

