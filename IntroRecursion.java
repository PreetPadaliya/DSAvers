// Recursion : Calling the function within itself

// Stack overflow / Stack Space condition : some number of time(limit) the function running
//                                          it stores remaining not completed fuctions in this like print();

class Nothing {
    int cnt = 0;
    void print(){
        System.out.println(cnt);
        cnt++;
        print();
    }
}

public class IntroRecursion {
    public static void main(String[] args) {
        Nothing n = new Nothing();
        n.print();
    }
}
