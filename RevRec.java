class Recursion{
    int cnt = 0;
    void recur(){
        if (cnt==3){
            System.out.println(3);
        }
        else{
            System.out.println(cnt);
            cnt++;
            recur();
        }
    }
}
public class RevRec {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.recur();
    }
}
