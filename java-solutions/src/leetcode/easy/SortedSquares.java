package easy;

import java.util.Arrays;

/*
 * 977. Squares of a Sorted Array
 */
public class SortedSquares {

	public int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
