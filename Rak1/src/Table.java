import java.util.Scanner;
public class Table {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter number for table to be printed: ");
        int num = sc.nextInt();
        int i;
        for(i=0;i<=10;i++)

        {
            System.out.println(num  +  " X " + i  + "+"  + num * i);
        }
    }
}
