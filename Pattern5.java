import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

       /* for (int i=n ; i>=1 ; i--){
            for (int j=i ; j>=1 ; j--){
                System.out.print("*");          // I LIKED THIS (SELFMADE)
            }
            System.out.println();
        }*/

        for (int i=1 ; i<=n ; i++){
            for (int j = 1 ; j<=n-i+1 ; j++){       // FROM THE LECTURE
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
