import java.security.KeyPair;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Vector;

public class Timecomplexity {
    public static void main(String[] args) {

        Vector<Integer> number = new Vector<>();
        number.add(1); 
        number.add(2);
        System.out.println(number.get(0));


        //For Pair
        Vector<AbstractMap.SimpleEntry<Integer,Integer>> vec = new Vector<>();
        vec.add(new AbstractMap.SimpleEntry<>(1,2));
        System.out.println(vec.get(0));
        System.out.println("vec = " + vec);


    }
}
