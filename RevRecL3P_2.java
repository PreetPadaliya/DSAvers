import java.util.Scanner;

class rProblem2{
    int rec(int n){
        if (n==0){
            return 0;
        }
        else {
           return n+rec(n-1);
        }
    }
}
public class RevRecL3P_2 {
    public static void main(String[] args) {
        System.out.print("Enter The Number : ");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        rProblem2 r = new rProblem2();
        r.rec(n);
        System.out.println(r.rec(n));
    }
}
