import java.util.Scanner;
//import java.util.Scanner;
public class Fibo_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter number upto you want to print Fibonacci numbers :");
        int n=sc.nextInt();
        int a=1;
        int b=1;
        int c;
        int i;
        System.out.print(a + " " + b);
        for (i = 2; i < n; i++)
        {
            c = a + b;
            System.out.print(" "+ c );
            a = b;
            b = c;
        }
    }
}
