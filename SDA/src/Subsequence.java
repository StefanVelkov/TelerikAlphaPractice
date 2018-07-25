import java.util.*;
/*
The whole name of Coki is Kociokkociiev (How do you even pronounce it, right?)
So, you task is to find if string contains the letters of another string,
in the same order, but not continiously.

For more clarification the the examples

Constraints
Both strings contain only lower case letters
Input
Read from the standard input

On the first line, find the small string, the possible substring
On the second line, find the big string
Output
Print on the standard output

On the single line, print "true" or "false",
whether the small string is a substring of the bigger string
 */
public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1= sc.nextLine();
        String str2 = sc.nextLine();

        List<Character> list = new LinkedList<>();

        Queue<Character> queue =new LinkedList<>() ;

        for (char ch :str1.toCharArray()) {
            list.add(ch);
        }
        for (char ch :str2.toCharArray()) {
            queue.add(ch);
        }

        boolean flag=false;

        while (!list.isEmpty()){
            flag=false;
            char ch = list.get(0);
            list.remove(0);
            while (!queue.isEmpty()){
                if(ch==queue.poll()){
                    flag=true;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}
