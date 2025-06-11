import java.util.Scanner;

public class if_else3 {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age < 18){
            System.out.println("Not eligible for job");
        }
        else if (age <= 54) {
            System.out.println("Eligible for job, but retirement soon");
        }
        else if (age <= 57) {
            System.out.println("Eligible for job, but retirement soon");
        }
        else{
            System.out.println("Retirement time");
        }
    }
}
