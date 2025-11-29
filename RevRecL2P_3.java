import java.util.Scanner;

class Problem3{
    int i = 1;
    void Print(int n){
        if (i>n){
            return;
        }
        else {
            System.out.println(n);
            n--;
            Print(n);
        }
    }
}
public class RevRecL2P_3 {
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Problem3 p = new Problem3();
        p.Print(n);
    }
}
