import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 10 ;
        long b = 20 ;
        double c = 2.3 ;

        String str = input.nextLine();
        System.out.println(str);

        int ch = input.nextInt();
        System.out.println(ch);

        char k = input.next().charAt(0);
        System.out.println(k);

    }
}
