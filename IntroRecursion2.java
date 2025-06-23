//Base Condition (The stack memory not overflowed)

class Nothingg{
    int cnt = 0;
    void print(){
        if (cnt==3){
            return;
        }
        System.out.println(cnt);
        cnt++;
        print();
    }
}
public class IntroRecursion2 {
    public static void main(String[] args) {
        Nothingg n = new Nothingg();
        n.print();
    }
}
