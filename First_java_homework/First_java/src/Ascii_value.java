import java.util.Scanner;
public class Ascii_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Find out what you have enter lower case alphabet or uppercase alphabet or number :");
        char n = sc.next().charAt(0);
        if (n >= 97 && n <= 122) {
            System.out.print(" User have enter lowercase alphabet :");
        }
        if (n >= 65 && n <= 90) {
            System.out.print(" User have enter uppercase alphabet :");
        }
        if (n >= 48 && n <= 57)
        {
            System.out.print(" User have enter digit :");
        }
    }
}
