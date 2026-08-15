public class Methods {

    // Method 1: no return value, no parameters
    public static void greet() {
        System.out.println("Hello!");
    }

    // Method 2: takes parameters, returns a value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 3: takes a parameter, returns a value
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        greet();

        int result = add(10, 20);
        System.out.println(result);

        int answer = square(5);
        System.out.println(answer);
    }
}