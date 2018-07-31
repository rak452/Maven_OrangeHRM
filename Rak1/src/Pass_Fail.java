/*import java.util.Scanner;
public class Pass_Fail {

    public static void main(){

        //int marks4;
        //float percentage;
        int total;
        float average;
        //int i;
        Scanner sc= new Scanner(System.in);
        System.out.print(" Please Enter student rollno :");
        int rollno= sc.nextInt();
        Scanner sc1= new Scanner(System.in);
        System.out.print(" Please Enter student name :");
        String name = sc1.next();
        System.out.print(" Enter 3 subjects marks :");
        Scanner sc2= new Scanner(System.in);
        int marks1 = sc2.nextInt();
        Scanner sc3=new Scanner(System.in);
        int marks2 = sc3.nextInt();
        Scanner sc4 = new Scanner(System.in);
        int marks3= sc4.nextInt();
        if(marks1>=35)
        {
            if(marks2>=35)
            {
                if(marks3>=35)
                {
                    System.out.print(" Pass ");
                }
            }
        }
        else
        {
            System.out.print(" Fail ");
        }

        total = marks1+marks2+marks3;
        if(total>=35)
        {
            System.out.print(" Pass: " +  total);
        }
        else
        {
            System.out.print(" Fail: ");
        }
    }
}
*/