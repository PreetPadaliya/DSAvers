import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int iniS=0;
        for (int i = 0 ; i < n ; i++){

            //stars
            for (int j = 0 ; j < n-i ; j++ ){
                System.out.print("*");
            }

            //spaces
            for (int k = 0 ; k < iniS ; k++){
                System.out.print(" ");
            }

            //stars
            for (int j = 0 ; j < n-i ; j++ ){
                System.out.print("*");
            }
            iniS = iniS+2;
            System.out.println();
        }

        iniS =8;
        for (int i = 1 ; i <= n ; i++){

            //stars
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }

            //spaces
            for (int k=0; k<iniS ; k++){
                System.out.print(" ");
            }

            //stars
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            iniS = iniS-2;
            System.out.println();
        }
    }
}
