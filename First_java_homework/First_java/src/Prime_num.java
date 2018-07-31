import java.util.Scanner;
public class Prime_num {
    public static void main(String[] args) {
        int i;
        int j;
        int n;
        int prime;
        Scanner sc = new Scanner(System.in);
        System.out.print(" How many prime numbers you want to print: ");
        n = sc.nextInt();
        for (i = 2;i<=n/2; i++)
       {
            //for(j=1;j<=n;j++) {
                if(n % i == 0)
                {
                    System.out.println(" Not Prime number." );
                }
                if (i == n) {
                    System.out.println(" Prime numbers." + n);
                }
            }
    }
    }
