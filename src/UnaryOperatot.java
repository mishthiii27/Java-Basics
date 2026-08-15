public class UnaryOperatot {
    public static void main(String[] args) {
        int x = 6;
        int y = -x;
        int z = -y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        int a = 4;
        System.out.println(++a); //pre increment i.e increase ny 1 and then use


        int b = 4;  // post increment says first use the current value then you increment it by 1

        System.out.println(b++);
        System.out.println(b);

        int m = 23;
        System.out.println(--m);
        int n = 200;
        System.out.println(n--);
        System.out.println(n);
    }
}
