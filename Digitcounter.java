import java.util.Scanner;

public class Digitcounter {
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0 ;

        while (n>0){
            int Lastdigit = n%10;
            count = count+1;
            n=n/10;
        }
        System.out.println(count);
    }
}
