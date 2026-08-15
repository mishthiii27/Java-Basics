import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
       int num = 1;  //initialization
        while(num <= 10){     //condition
            System.out.println(num);   //actual working
           num += 1;    //updating the condition
        }
        int count = 500;   //initialization
        while (count>=200){      // condition
            System.out.println(count);;  //actual work
          count -= 1;   //update
       }

        Scanner input = new Scanner(System.in);
        System.out.println("enter the value");
        int value = input.nextInt();

        while(value <10){

            System.out.println(value);
                value++ ;
        }
    }
}
