import java.util.Scanner;
public class Divide_3_5 {

    public static void main(String[] args)
    {
      int n;
      int i;
      int j;
      Scanner sc = new Scanner(System.in);
      System.out.print(" Enter number to upto you want to find out divided by 3 & 5 :");
      n=sc.nextInt();
      System.out.print(" Number divided by 3 are :");
      for(i=0;i<n;i++)
      {
          if(i%3==0)
          {
              System.out.print(""+ i + ",");
          }

      }
      System.out.print("\n Number divided by 5 are :");
    for(j=0;j<n;j++)
    {
        if (j%5==0)
        {
            System.out.print("" + j + ",");
        }
    }
    }

}
