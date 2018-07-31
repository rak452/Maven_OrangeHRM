import java.util.Scanner;
public class Vowels
{
   public static void main(String[] args)
   {

       Scanner sc= new Scanner(System.in);
       System.out.print(" Please Enter character: ");
       String alpha= sc.next().toLowerCase();
       boolean upper = alpha.charAt(0)>=65 && alpha.charAt(0)<=90;
       boolean lower =alpha.charAt(0)>=97 && alpha.charAt(0)<=122;
       boolean vowels =alpha.equals("a") || alpha.equals("e")||alpha.equals("i")||alpha.equals("o")||alpha.equals("u");
       if(alpha.length()>1)
       {
           System.out.println(" User enter more than one character:");
       }
       else if(!(upper||lower))
       {
           System.out.println(" User didnot enter alphabet: ");
       }
       else if(vowels)
       {
           System.out.println(" User enter vowels: ");
       }
       else
       {
           System.out.println(" User enter Consonant :");
       }
   }
}

