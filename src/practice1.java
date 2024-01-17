import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numofdigits = 0;

        while(n>0){
            n = n/10;
            numofdigits++;
        }
        System.out.println(+numofdigits);
    }
}
