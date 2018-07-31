import java.util.Scanner;
public class Pos_Neg_zero

{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter number  :");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println(" Number entered by user is Negative");
        }
        else if(a == 0)

        {
            System.out.println(" Number entered by user is zero ");
        }

        else
        {
            System.out.println(" Number entered by is Positve");
        }
    }
}