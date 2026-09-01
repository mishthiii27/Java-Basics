import java.util.Scanner;

public class AgeCategories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your age : ");
        int age = input.nextInt();
        if(age >= 60 ){
            System.out.println("Umar Hogyiiii Bhaiii ");
        }
        else if(age >= 20  && age < 60){  // no need for logical and because if statement already filter karke hi aage bhejti hai
            System.out.println(" PAISA KAMAOOO ");
        } else if (age >= 13 && age < 20) {
            System.out.println("SCHOOL JAOOOOOO BESTTTTTT");
        }
        else{
            System.out.println(" BABY HO  ");
        }
    }
}
