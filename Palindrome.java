import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev = 0;
        int dup = n;

        while (n>0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n = n/10;
        }
        System.out.println(rev);
            if (rev == dup){
                System.out.println("It is a Palindrome Number");
            }
            else {
                System.out.println("It is not a Palindrome Number");
            }
        }
    }
