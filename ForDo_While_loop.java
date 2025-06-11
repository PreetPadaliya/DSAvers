public class ForDo_While_loop {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1 ; i <= 5 ; i++){
            System.out.println(i+". Preet");
        }
        System.out.println(i);

        // While-loop
        int j = 1;
        while (j<=5){
            System.out.println(j+". Padaliya");
            j++;
        }
        System.out.println(j);

        // Do While-loop
        int k = 3;
        do {
            System.out.println("Nothing");
            k++;
        }while (k<2);
        System.out.println(k);

    }
}
