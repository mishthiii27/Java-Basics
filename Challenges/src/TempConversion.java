import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Temperature in Fahrenheit: ");
        float Temp = input.nextFloat();
        float Celsius = ((Temp - 32) * 5 / 9);
        System.out.println("the temp is cel is: " + Celsius);
    }
}
