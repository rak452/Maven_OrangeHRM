import java.util.Scanner;
public class Vote_right
{
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print( " Please enter age of person to check is eligible to vote or not : " );
     int age = sc.nextInt();

     if(age<18)
         System.out.print( " Person is not eligible to vote");
     else
         System.out.print( " Person eligible to vote");

 }
}

