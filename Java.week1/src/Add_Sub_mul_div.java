import java.util.Scanner;
public class Add_Sub_mul_div {

    public static void main(String[] args) {
        char operator;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter first Number  : ");
        int a = sc.nextInt();
        System.out.print(" Enter second Number  : ");
        int b = sc.nextInt();
        System.out.print(" Please enter operator(+,-,*,/)  : ");
        operator = sc.next().charAt(0);

        if ( operator == '+') {
            c = a + b;
            System.out.print(" Addition of two numbers entered by user : " + c);
        } else if ( operator == '-') {
            c = a - b;
            System.out.print(" Substraction of two numbers entered by user : " + c);
        } else if ( operator == '*') {
            c = a * b;
            System.out.print(" Multiplication of two numbers entered by user : " + c);
        } else if ( operator == '/') {
            c = a / b;
            System.out.print(" Divison of two numbers entered by user : " + c);
        } else {

            System.out.print(" User enter Wrong Operator");
        }

    }
}
