package strings;

import java.util.Arrays;

/*
 * 344. Reverse String
 */
public class ReverseString {

	public static void reverseString(char[] s) {
        int end = s.length - 1;
        for(int i = 0; i < s.length / 2; i++) {
            swap(i, end, s);
            end--;
        }
    }
    public static void swap(int a, int b, char[] s) {
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
    
	public static void main(String[] args) {
		char[] test = {'h','e','l','l','o'};
		System.out.println("Original: " + Arrays.toString(test));
		reverseString(test);
		System.out.println("Reversed: " + Arrays.toString(test));

	}

}
