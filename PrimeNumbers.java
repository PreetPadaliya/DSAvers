import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2) {
            System.out.println(n + " is a Prime number.");
        }
        else {
            System.out.println(n + " is not a Prime number.");
        }
    }
}
