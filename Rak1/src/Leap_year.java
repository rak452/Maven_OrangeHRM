import java.util.Scanner;
public class Leap_year

{
    static public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please Enter year :  ");
        int a = sc.nextInt();
        if (a % 4 == 0)
            System.out.print(" This is leap year :");
        else
            System.out.print(" Entered year by user is not leap year :");

    }
}
