public class TypeConversion_Explicit {
    public static void main(String[] args) {
        int myInt = (int) 5.05f; // float to int
        int myInt2 = (int) 5.05D; // double to int
        float myFloat = (float) 5.0034D;  // double to float
        long amBigger = (long) 3.455;  // double to long
        System.out.println(myInt);
        System.out.println(myInt2);
        System.out.println(myFloat);
        System.out.println(amBigger);
    }
}


