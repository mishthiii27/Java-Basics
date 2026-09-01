import java.util.Scanner;

public class If_else1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter the number: ");
        int num = input.nextInt();
                if(num > 0){
                    System.out.println("Positive Number");
                }
                else if(num < 0){
                    System.out.println("negative number");
                }
                else{
                    System.out.println("the number is zero");
                }
    }
}
