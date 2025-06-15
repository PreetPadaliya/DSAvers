import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            for (int j = 1 ; j<2*(n-i) ; j++){
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
