package DSAbyShraddha.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static int [] Twosum(int arr[], int target){

        Map<Integer,Integer> compl = new HashMap<>();

        for (int i=0;i< arr.length;i++){

            int complement= target-arr[i];

            if (compl.containsKey(complement)){

                return new int[] {compl.get(complement),i};
            }
            else compl.put(arr[i],i);
        }
        throw new IllegalArgumentException("no match");
    }

    static int[] Twosum_bruteForce(int arr[], int target){

        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target) return new int[] {i,j};
            }

        }
        return new int[] { };

    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 13;

        Twosum_bruteForce(arr,target);

    }
}
