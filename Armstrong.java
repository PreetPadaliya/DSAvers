import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int dup = n;

        while (n>0){
            int lastDigit = n%10;
            sum = sum + (lastDigit*lastDigit*lastDigit);
            n = n/10;
        }
        System.out.println("Sum : "+sum);
        if (sum == dup ){
            System.out.println("Yes its an Armstrong");
        }
        else {
            System.out.println("Not its not an Armstrong");
        }
    }
}
