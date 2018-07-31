import java.util.Scanner;
public class Even_Odd_Ternary {
    public static void main(String[] args)

    {
        String c;
        String d;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter first Number :");
        int a = sc.nextInt();
        c = (a%2==0) ? "EVEN" : "ODD";
        System.out.println( "Number entered by user is : " + c);
        System.out.print(" Enter Second Number :");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        d = b%2==0 ? "EVEN" : "ODD" ;
        System.out.println( "Number entered by user is : " + d);
        }

}

