package leetcode;

import java.util.Arrays;

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
