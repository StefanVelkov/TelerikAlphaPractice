/*Given two strings S and T,
return if they are equal when both are typed into empty text editors.
 # means a backspace character.
 Example 1: Input: S = "ab#c", T = "ad#c"
 Output: true Explanation: Both S and T become "ac".
*/

import java.util.Arrays;
import java.util.Stack;

public class BackspaceStrCmp {

    public static String transform(String str) {

        Stack<Character> result = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {

                result.push(str.charAt(i));

            }
            else if (!result.empty()) {
                result.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!result.empty()){
            sb.append(result.pop());
        }

        return sb.reverse().toString();
    }

    public static boolean backspaceCompare(String S, String T) {
        return transform(S).equals(transform(T));
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab##", "c#d#"));

    }
}



