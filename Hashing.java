/*
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter values of array : ");
        for (int i=0; i<n ;i++){
            arr[i] = input.nextInt();
        }

        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.print("Enter value of query : ");
        int query = input.nextInt();
        System.out.print("Enter numbers to find count in array : ");
        while (query >= 0){
            int number = input.nextInt();
            query--;

            System.out.println(map.getOrDefault(number, 0));
        }
    }
}
*/

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter values of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter value of query : ");
        int query = input.nextInt();

        System.out.println("Enter numbers to find count in array : ");
        while (query-- > 0) {
            int number = input.nextInt();
            int count = 0;


            for (int j = 0; j < n; j++) {
                if (arr[j] == number) count++;
            }

            System.out.println(count);
        }

        input.close();
    }
}


