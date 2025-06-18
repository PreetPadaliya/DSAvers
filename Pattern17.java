import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for (int k = 1; k <= 2*i + 1; k++){
                System.out.print(ch);
                if (k<=breakpoint){
                    ch++;
                }
                else {
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
