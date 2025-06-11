import java.util.Locale;

public class ArrayString_pr {
    public static void main(String[] args) {
        int[] num = {1,2,3} ;
        System.out.println(num[2]);
        System.out.println(num[2]+3);

        int[][] size={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(size[1][1]);

        String str = "Preet";
        System.out.println(str.toLowerCase(Locale.ROOT));
    }

}
