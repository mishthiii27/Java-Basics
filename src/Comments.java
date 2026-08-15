import java.util.Scanner;

public class Comments
/** Documentation comment
 to add a note when it is clicked */{
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in); // single line comment
        System.out.println("Enter your age");
        int age = input.nextInt();  /* thats for to give input through console
                                    multi line comment*/
        System.out.println("WHAT IS YOUR NAME ");
        String name = input.next();


    }
}
