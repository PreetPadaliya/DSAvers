import java.util.Scanner;

class Recur2 {
    static void printName(String name, int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(name);
            printName(name, n - 1);
        }
    }
}

public class RecursionProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("How many times to print? ");
        int n = sc.nextInt();

        Recur2 rec = new Recur2();
        rec.printName(name, n);
    }
}



