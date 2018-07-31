import java.util.Scanner;
public class Tabels {
    public static void main(String[] args){

        int i;
        int j;
        //int n=10;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number table to print : ");
        int num = sc.nextInt();
         for(j=1;j<=10;j++)
            {
                System.out.println( num + " X " + j + " = " + num*j);
            }
        }

}
