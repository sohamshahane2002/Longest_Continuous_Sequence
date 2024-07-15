
package LongestConsecutiveSequence;
import java.util.*;
public class LongestConsSeq1 {
    public static boolean linearSearch(int arr[] , int num){
        int n = arr.length;
        for (int i = 0 ;i<n; i++){
            if(arr[i]==num)
            return true;
        }return false;

    }
    public static int LongestConsecutiveSeq(int arr[]){
        int n = arr.length;
        int longest =1;

        for(int i =0;i<n ;i++){
            int x = arr[i];
            int cnt = 1;

            while(linearSearch(arr, x+1)==true){
                x = x+1;
                cnt = cnt +1;
            }
            longest = Math.max(longest, cnt);
        }return longest;
    }
    public static void main(String[] args) {
        int array[] ={100, 200, 1, 2, 3, 4};
        int ans = LongestConsecutiveSeq(array);
        System.out.println("The longest successive sequence is : "+ ans);
    }
}
