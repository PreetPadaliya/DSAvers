/*import java.util.Scanner;

class Recursion2{
    int cnt = 1;

    void PrintName(String name){
        if (cnt==5){
            System.out.println("Your Name is : "+name);
        }
        else {
            System.out.println("Your Name is : "+name);
            cnt++;
            PrintName(name);
        }
    }
}
public class RevRecL2P_1 {
    public static void main(String[] args) {
        System.out.println("Enter your name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Recursion2 rec = new Recursion2();
        rec.PrintName(name);
        rec.cnt=1;
        rec.PrintName(name);
    }
}*/


// Lecture's trick
import java.util.Scanner;

class Recur{
       void recur(String name ,int num){
           if (num == 0){
               return;
           }
           else {
               System.out.println("My name is :"+name);
               num = num-1;
               recur(name , num);
           }
       }
}
public class RevRecL2P_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = input.nextLine();

        System.out.println("Enter how many times you wants to print : ");
        int num = input.nextInt();

        Recur r = new Recur();
        r.recur(name,num);

    }
}
