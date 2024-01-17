import java.util.Scanner;

//Count the number of digits for a given number n = 12356
 public class Count_thenum_odDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numofdigits = 0;

        while(n>1){
            n = n/10;
            numofdigits++;

        }
        System.out.println("NUmberof digits is "+n+"="+numofdigits );
    }
}
