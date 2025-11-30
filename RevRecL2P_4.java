//Backtracking

import java.util.Scanner;

class Problem4{
    void Rec4(int i ,int n){
        if (i<1){
            return;
        }
        else {
            Rec4(i-1 , n);
            System.out.println(i);
        }
    }
}
public class RevRecL2P_4 {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Problem4 p = new Problem4();
        p.Rec4(n,n);
    }
}
