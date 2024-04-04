import java.util.Arrays;

public class MergeArrays {

    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }

        
        int i = n;
        int j = 0;
        int p = 0;

        while (p < m) {
            if (i < m && (j >= n || X[i] <= Y[j])) {
                X[p] = X[i];
                i++;
            } else {
                X[p] = Y[j];
                j++;
            }
            p++;
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        mergeArrays(X, Y);
        
        System.out.println(Arrays.toString(X)); // Output: [1, 2, 3, 5, 6, 8, 9, 10, 15]
    }
}
