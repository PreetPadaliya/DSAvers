import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = n ; i>0 ; i--){
            for (int j = 0; j<i ; j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}
