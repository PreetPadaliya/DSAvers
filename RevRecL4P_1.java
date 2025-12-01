import java.util.Arrays;

class Array{
    void Swap(int[] arr ,int l , int r){
        if (l>=r){
            return;
        }
        else {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            Swap(arr,l+1,r-1);
        }
    }
}
public class RevRecL4P_1 {
    public static void main(String[] args) {

        int []arr = {1,3,2,5,4};
        int n = arr.length;
        Array a = new Array();
        a.Swap(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

}
