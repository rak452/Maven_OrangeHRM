public class Calculator
{

    public static void s1(int i, int j)
    {
        int sbustraction = i - j;

        System.out.println("Sbustraction of "  + i +  " and "  + j +  " = "  + (sbustraction));

    }

    public static void m1(int i, int j) {
        int multiplication = i * j;
        System.out.println("Multiplication of  "  + i +  " and " + j +  " = "  + (multiplication));
    }
    public static void main(String[] args)
    {
        //s1(5, 2);
        //m1(10, 2);

        Calculator calculator = new Calculator();// created object- to call non static method in main method
        calculator. divison( 10,2);
    }
public void divison ( int i , int j )

{
    float divison = i/j;
    System.out.println(divison);
    Calculator.m1(14,7); // calling static method in instance area - by classname
}}


          //  addition(3,4;d: 4);
            //}

            //public static void stringConcat
