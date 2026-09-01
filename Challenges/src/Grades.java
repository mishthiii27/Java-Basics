import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your percentage : ");
        int percentage = input.nextInt();
        if(percentage >= 90 ){
            System.out.println("Grade A");
        }
        else if(percentage >= 75 ){
            System.out.println("grade B"); // here no need for logical and because agr 75 tak aaye hai then automatically pta hai 90 sai kam hi hogi
        } else if (percentage >= 60 ) {
            System.out.println("grade C");
        }
        else if(percentage >= 30){
            System.out.println("grade D");
        }
        else{
            System.out.println("Grade F , padhleeee jaakar ");
        }
    }
}
