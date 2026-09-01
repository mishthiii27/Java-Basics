public class PatternViaMethod {
    public static void main(String[] args) {
    FirstPattern();
    PatternQues();
    PatternTwo();
    }
    public static void FirstPattern()
    {
        int i = 1;
         while(i <= 5) {
             int j = 1; //column
             while (j <= i) {
                 System.out.print("* ");
                 j++;
             }
             System.out.println();
             i++;
         }
    }
    public static void PatternQues() {
        for (int i = 1; i <= 5; i++) {  //outer loops , How many rows
            for (int j = 1; j <= i; j++) {   // inner loop how many stars in each
                System.out.print("#");
            }
            System.out.println();
        }
    }
        public static void PatternTwo() {
        for(int i = 1 ; i<=5; i++){
            for(int j=5 ; j>=i; j--){
                System.out.print("@");
            }
            System.out.println();
        }
        }

}
