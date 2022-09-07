import java.util.Arrays;
import java.util.LinkedHashSet;

public class remove_repeated_elements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        int n = arr.length;
        removeDuplicates(arr,n);
    }

    private static void removeDuplicates(int[] arr, int n) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

    }


}
