package DSAbyShraddha.Arrays;

import java.util.ArrayList;

public class SildingWindow {
    class solution{
        static ArrayList<Integer> SubArray_sum(int[] arr, int target){
            ArrayList<Integer> result= new ArrayList<>();
            int n= arr.length;
            int start=0;
            int currSum=0;

            for (int end=0;end<n;end++){
                currSum+=arr[end];

                while (currSum> target&&start<end){

                    currSum-=arr[start];
                    start++;
                    if (currSum == target) {
                        result.add(start + 1); // 1-based index
                        result.add(end + 1);   // 1-based index
                        return result;
                    }
                }
            }
            result.add(-1);
            return result;
        }
    }
}
