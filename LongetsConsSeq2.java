//OPTIMIZED SOLUTION
package LongestConsecutiveSequence;
import java.util.*;
public class LongetsConsSeq2 {
    public static int LongestConsecutiveSeq(int arr[]){
        int n =arr.length;
        if(n==0)
        return 0;
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
      // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int firstnum : set ){
            if(!set.contains(firstnum-1))
            {
                // find consecutive numbers
                int cnt = 1;
                int x = firstnum;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
        }
        public static void main(String[] args) {
            int[] a = {100, 102, 1, 2, 3, 4,};
            int ans = LongestConsecutiveSeq(a);
            System.out.println("The longest consecutive sequence is " + ans);
        }
}

