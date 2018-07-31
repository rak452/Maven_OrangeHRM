import java.util.Scanner;
public class Students_Grades {

    public static void main(String[] args)
    {
        int marks4;
        float percentage;
        int total=0;
        float average;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please Enter Student Roll no : ");
        int rollno = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print(" Please Enter Student Name    : ");
        String name = sc1.next(); // for name
        System.out.print(" Enter 3 Subjects marks  :");
        Scanner sc2 = new Scanner(System.in);
        int marks1 = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        int marks2 = sc3.nextInt();
        Scanner sc4 = new Scanner(System.in);
        int marks3 = sc4.nextInt();
        marks4 = marks1+ marks2 + marks3;
        percentage = marks4/3;
        if (percentage >= 80) {
            System.out.println(" total :" + marks4 + " percentage  :" + percentage + " grade " + " A+ ");
        } else if (percentage >= 60) {
            System.out.println(" total :" + marks4 + " percentage  :" + percentage + " grade " + " A ");
        } else if (percentage >= 50) {
            System.out.println(" total :" + marks4 + " percentage  :" + percentage + " grade " + " B ");
        } else if (percentage >= 35) {
            System.out.println(" total :" + marks4 + " percentage  :" + percentage + " grade " + " C ");
        } else
            System.out.print(" Fail ");
    }
}