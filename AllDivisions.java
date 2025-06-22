import java.util.Scanner;

public class AllDivisions {
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1 ; i<=n ; i++ ){
            if (n%i==0){
                System.out.println(i);
            }
        }
    }
}
