import java.util.Scanner;

class Problem5{
    void Recur5(int i , int n){
        if (i<1){
            return;
        }
        else {
            System.out.println(i);
            Recur5(i-1,n);

        }
    }
}
public class RevRecL2P_5 {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Problem5 p = new Problem5();
        p.Recur5(n,n);
    }
}
