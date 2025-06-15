import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // row
        for (int i = 0 ; i < n ; i++){

            // space
            for (int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }

            // star
            for (int k = 0 ; k < 2*i+1 ; k++){
                System.out.print("*");
            }



            //droping line
            System.out.println();
        }
    }
}
