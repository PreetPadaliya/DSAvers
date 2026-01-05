import java.util.ArrayList;

public class arrayChai {
    public static void main(String[] args) {
        int[] numbers = {12,13,14,15};
  /*    for (int i = numbers.length-1; i>= 0 ; i--){
          System.out.println(numbers[i]);
      }*
   */
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(18);
        int abc = ArrayList<>[1:2]
        num.add(0,12);
        System.out.println(num.get(1));
        System.out.println(num.size());
        System.out.println(num);
    }
}
