import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i=0 ; i<n ; i++){
            for (int j = 'E'-i ; j<='E' ; j++){
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}
