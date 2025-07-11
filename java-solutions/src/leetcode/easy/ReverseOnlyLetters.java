package easy;

import java.util.Stack;

/*
 * 917. Reverse Only Letters
 */
public class ReverseOnlyLetters {

	public String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack<>();
        char[] str = S.toCharArray();
        for(int i = 0; i < str.length; i++) {
            if(Character.isLetter(str[i])) {
                letters.push(str[i]);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length; i++) {
            if(Character.isLetter(str[i])) {
                result.append(letters.pop());
            } else {
                result.append(str[i]);
            }
        }
        return result.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
