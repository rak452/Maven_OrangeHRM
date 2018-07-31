import java.util.Scanner;
public class Square_num {

    public static void main(String[] args)
    {
        int i;
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number you want to print square : ");
        int n =sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=i*i;
            System.out.print(a + ",");
        }
    }
}
