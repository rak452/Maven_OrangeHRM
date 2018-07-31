import java.util.Scanner;

public class Swap_numbers

{
    public static void main(String[] args)

    {

        System.out.print(" Enter First Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(" Enter Second Number: ");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.print(" Numbers Entered by user is swaped  : ");
        System.out.print(a+ "    " +b);


    }
}
