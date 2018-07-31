import java.util.Scanner;
public class Average_5_number {
    public static void main(String[] args)
    {
        int total;
        double average;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter first number : ");
        int sc1= sc.nextInt();
        System.out.print( " Please enter second bunber :");
        int sc2 = sc.nextInt();
        System.out.print( " Please enter third number :");
        int sc3 = sc.nextInt();
        System.out.print( " Please enter fourth number :");
        int sc4 = sc.nextInt();
        System.out.print( " Please enter fifth number :");
        int sc5 = sc.nextInt();

        total =(sc1+sc2+sc3+sc4+sc5)/5;
        // average = total/5;
        System.out.print(" Average of 5 Number is: " + total);
    }
}