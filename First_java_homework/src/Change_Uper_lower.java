import java.util.Scanner;
public class Change_Uper_lower
{
    public static void main(String[] args)
    {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Character you want to change to lower case: ");
        char alpha =sc.next().charAt(0);
        if(alpha >= 65 && alpha <= 90)
        {
           temp= (int) alpha;
           temp= temp+32;
           alpha= (char)temp;
           System.out.print(alpha);
        }
        else
        {
            System.out.print(" User have wrong character ");
        }
    }

}
