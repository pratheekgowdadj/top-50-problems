import java.util.Arrays;

public class transpose_matrix {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{3,4,5},{6,7,8}};
        int[][] remp = new int[3][3];
        for(int i = 0; i < arr.length ; i++){
            for (int j = 0; j < arr[0].length; j++) {
                remp[j][i] = arr[i][j];
            }
        }
             //for(int[] row : remp)
                 System.out.println(Arrays.deepToString(remp));
    }
}
