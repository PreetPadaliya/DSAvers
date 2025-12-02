class RecPalindrome{
    void Palindrome(String s,int i, int n){
        if (i>=n/2){
            System.out.println(true);
            return;
        }
        if(s.charAt(i) != s.charAt(n-i-1)){
            System.out.println(false);
            return;
        }
        else {
            Palindrome(s,i+1,n);
        }
    }
}

public class RevRecL4P_2 {
    public static void main(String[] args) {
        String s = "MADAM";
        int n = s.length();

        RecPalindrome r = new RecPalindrome();
        r.Palindrome(s,0,n);
    }
}
