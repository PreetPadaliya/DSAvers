import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev = 0;

        while (n>0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}
