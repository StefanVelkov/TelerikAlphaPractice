/*
Shosho loves to compete with his brother Shoshonka
and wants always to have more coins than him.
One day their mother gave each of them a bag full of coins.
They both got ecstatic, but, of course, Shosho wanted to know
whether his brother had more money than he did and decided to cheat Shoshonka.

He said - "Ok, let's spread the coins into a row and check out
if you have bigger coins then me".
It turns out that Shosho's bag1 is a subset of Shoshonka's bag2,
but none of the bags contain duplicates (so no duplicates).
So, Shosho decided to find all next greater coins for bag1's
elements in the corresponding places of bag2.
And then to take them (as he is evil and jealous, don't forget).

The next greater coin (number) of a number x in bag1 is the first greater
coin (number) to its right in bag2.
If it does not exist, the result (output) will be -1 for this number.

Input
You will get two lines
On the first line will be the coins (numbers) in the array bag1,
separated by a comma
On the second line will be the coins (numbers) in the array bag2, separated by a comma
Output
Print the result on the standard output
The result should be the coins(numbers), separated by a comma
Constraints
All elements in bag1 and bag2 are unique.
The length of both bag1 and bag2 would not exceed 1000.
Sample tests
 */
import java.util.Scanner;

public class GreaterMoney {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String bag1 = sc.nextLine();
        String bag2 = sc.nextLine();

        String[]shosho=bag1.split(",");
        String[]shoshana=bag2.split(",");

        int [] result = new int[shosho.length] ;

        for (int i = 0 ; i < shosho.length;i++){

            int num  =Integer.parseInt(shosho[i]);

            result[i]=-1;
            int index = 0 ;

            for (int j=0;j<shoshana.length;j++ ){
                if(Integer.parseInt(shoshana[j])==num){
                    index=j;
                }
            }

            for (int j = index ; j < shoshana.length;j++){
                if (num<Integer.parseInt(shoshana[j])) {
                    result[i]=Integer.parseInt(shoshana[j]);
                    break;
                }
            }
        }
        String out = "";

        for (int i = 0 ; i <result.length-1;i++){
            out+=result[i];
            out+=",";
        }

        out+=result[result.length-1];
        System.out.println(out);
    }
}
