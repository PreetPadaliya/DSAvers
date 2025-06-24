import java.util.Scanner;

public class RecursionProblem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = input.nextInt();
        number(1, n);
    }
        static void number(int i , int n){
            if (i>n){
                return;
            }
            else {
                System.out.println(i);
                number(i+1,n);
            }
        }
    }

