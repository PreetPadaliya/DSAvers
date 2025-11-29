import java.util.Scanner;

class Problem2{
    int i=1;
    void print(int n){
                if (i>n){
                    return;
                }
                else {
                    System.out.println(i);
                    i++;
                    print(n);
                }
            }
    }
public class RevRecL2P_2 {
    public static void main(String[] args) {

        System.out.print("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Problem2 p = new Problem2();
        p.print(n);

    }
}
