import java.util.Arrays;

public class reversing_an_array_inplace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i = arr.length - 1, j = 0;
        while(j < i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i--;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
