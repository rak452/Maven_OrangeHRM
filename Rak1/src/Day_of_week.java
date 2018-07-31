import java.util.Scanner;

public class Day_of_week {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Please Enter Number between (0-6)  :");
        int day = sc.nextInt();

        if (day == 0) {
            System.out.print(" Today is Sunday ");
        } else if (day == 1) {
            System.out.print(" Today is Monday ");
        } else if (day == 2) {
            System.out.print(" Today is Tuesday ");
        } else if (day == 3) {
            System.out.print(" Today is Wednesday ");
        } else if (day == 4) {
            System.out.print(" Today is Thursday ");
        } else if (day == 5) {
            System.out.print(" Today is Friday ");
        }else if (day == 6) {
            System.out.print(" Today is Saturday ");
        }
        else {
            System.out.print(" Wrong number ");
        }

    }
}
