import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        System.out.print("Enter your input number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
