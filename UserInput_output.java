import java.util.Scanner;

public class UserInput_output {
    public static void printNumber(Scanner input) {
        System.out.println("Enter a number:");
        int num = input.nextInt();
        System.out.println(num);
    }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        printNumber(scanner);
    }
}
