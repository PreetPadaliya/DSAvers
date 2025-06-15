import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = 1;

        for (int i = 1 ; i<= n ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
