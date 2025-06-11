//class Ok {
// void printName() {
//        System.out.println("Preet");
//    }
//}
//
//public class Functions {
//    public static void main(String[] args) {
//       Ok o = new Ok();
//       o.printName();
//    }
//}

import java.util.Scanner;

public class Functions {
    public static int sum(int num1, int num2) {
        int num3 = num1 + num2;
        return num3;
    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number1 : ");
            System.out.println("Enter number2 : ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int res = sum(num1,num2);
            System.out.println(res);

        }
    }

