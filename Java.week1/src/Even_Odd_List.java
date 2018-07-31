public class Even_Odd_List {
    public static void main(String[] args) {
        int Limit = 70;
        int num=1;
        int i;
        //System.out.println(" Even Numbers  :");
        //System.out.println(" Odd Numbers   :");
        for (i = 0; i < 70; i++) {
            if (num % 2 == 0) {
                System.out.print(" Even Numbers  :");
                System.out.println(num);
            } else {
                System.out.print(" Odd Numbers   :");
                System.out.println(num);
            }num++;
            //break;
        }
    }
}
