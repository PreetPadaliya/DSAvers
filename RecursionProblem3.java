import java.util.Scanner;

public class RecursionProblem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = input.nextInt();
        number(n, 1);
    }
    static void number(int n , int i){
        if (n<i){
            return;
        }
        else {
            System.out.println(n);
            number(n-1,i);
        }
    }
}

