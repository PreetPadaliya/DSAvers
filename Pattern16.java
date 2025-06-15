import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j<=i ; j++){
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
    }
}
