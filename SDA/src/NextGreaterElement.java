/*
You are given two arrays (without duplicates) nums1 and nums2
 where nums1’s elements are subset of nums2.
 Find all the next greater numbers for nums1's elements in the corresponding places
 of nums2.

The Next Greater Number of a number x in nums1 is the first greater number
to its right in nums2. If it does not exist, output -1 for this number.

Example :
Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
Output: [-1,3,-1]

 */
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map <Integer,Integer> gosho = new HashMap<>();

        for (int i= 0 ; i < nums2.length;i++ ) {
            gosho.put(nums2[i],i);
        }
        for (int i = 0 ; i < nums1.length ; i++){
            int currNum = nums1[i] ;
            int beginningIndex = gosho.get(currNum) + 1 ;

            while (beginningIndex < nums2.length) {
                int num2 = nums2[beginningIndex];

                if (currNum<num2){
                    nums1[i]=num2;
                    break;
                }
                beginningIndex++;
            }

            if(nums1[i]==currNum){
                nums1[i]=-1;
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int [] a = {2,4};
        int [] b = {1,2,3,4};
        int result []  = nextGreaterElement(a,b);
        for (int i = 0 ; i <result.length;i++){
            System.out.println(result[i]);
        }
    }
}
