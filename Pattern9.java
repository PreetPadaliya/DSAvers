import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2*i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5 ; i > 0 ; i--){

            for (int j = 0 ; j < n-i ; j++  ){
                System.out.print(" ");
            }
            for (int k = 0 ; k<2*i-1 ; k++ ) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
