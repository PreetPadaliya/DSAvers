import java.util.Scanner;

public class RecursionProblem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = input.nextInt();
        number(n, n);
    }
    static void number(int i , int n){
        if (i<1 ){
            return;
        }
        else {
            number(i-1,n);
            System.out.println(i);
        }
    }
}

