import java.util.Scanner;

public class Functional_RCRSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        System.out.println(Functional(n));
    }

    static int Functional(int n) {
        if (n == 0) {
            return 0;
        }
        return n + Functional(n - 1);
    }
}
