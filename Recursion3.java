// Parameterised Recursion

import java.util.Scanner;

public class Recursion3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = input.nextInt();
        int sum;

        Parameter(n,0);
    }
    static void Parameter(int n , int sum){
        if (n<1){
            System.out.println(sum);
            return;
        }
            Parameter(n-1,sum+n);
    }
}
