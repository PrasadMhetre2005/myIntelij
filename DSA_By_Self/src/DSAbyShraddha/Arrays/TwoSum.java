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

    public static void main(String[] args) {

    }
}
