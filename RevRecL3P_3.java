import java.util.Scanner;

class rProblem3{
    int factorial(int n){
        if (n==0){
            return 1;
        }
        else {
          return n*factorial(n-1);
        }
    }
}
public class RevRecL3P_3 {
    public static void main(String[] args) {

        System.out.print("Enter the Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        rProblem3 r = new rProblem3();
        r.factorial(n);
        System.out.println(r.factorial(n));
    }
}
