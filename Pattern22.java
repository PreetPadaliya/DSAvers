import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0 ; i<2*n-1 ; i++){
            for (int j = 0 ; j<2*n-1 ; j++){
               int top =i ;
               int left = j ;
               int right = (2*n-2)-j;
               int down = (2*n-2)-i;
                int value = n - Math.min(Math.min(top, down), Math.min(left, right));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
