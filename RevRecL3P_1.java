import java.util.Scanner;

class Problem1{
    void Rec(int i , int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        else {
            Rec(i-1,sum+i);

        }
    }
}
public class RevRecL3P_1 {
    public static void main(String[] args) {
        Problem1 p = new Problem1();
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();

        p.Rec(sum,0);
    }
}
