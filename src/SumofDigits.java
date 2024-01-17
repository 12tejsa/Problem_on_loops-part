//to find sum  of digits
import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Sumofdigits = 0;

        while(n>0){
            Sumofdigits +=n %10;
            n = n/10;


        }
        System.out.println("Sum off digits is "+n+"="+Sumofdigits );
    }
}

