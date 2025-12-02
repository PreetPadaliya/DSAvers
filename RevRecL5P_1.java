import java.util.Scanner;

class Fibonacci{
    int Fibo(int n){
        if(n<=1){
            return n;
        }
        else {
            int last = Fibo(n-1);
            int slast = Fibo(n-2);
            return last+slast;
        }
    }
}

public class RevRecL5P_1 {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Fibonacci f = new Fibonacci();
        System.out.println(f.Fibo(n));
    }
}
