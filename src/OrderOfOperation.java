public class OrderOfOperation {
    public static void main(String[] args) {

        System.out.println(18/9-2*12); //Bodmas
        System.out.println(18/9/3); //Multiple same operator, hence move left to right
        System.out.println(18/(9/3+9));  // () gets first preference
        
    }
}
