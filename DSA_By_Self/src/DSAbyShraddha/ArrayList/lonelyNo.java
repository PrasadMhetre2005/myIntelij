package DSAbyShraddha.ArrayList;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lonelyNo {

    public ArrayList<Integer> findLonely(ArrayList<Integer> nums){

        ArrayList<Integer> res= new ArrayList<>();

        Collections.sort(nums);

        for (int i =1;i< nums.size()-1;i++){
            if (nums.get(i-1)+1<nums.get(i) && nums.get(i)+1< nums.get(i+1)){
                res.add(nums.get(i));

            }

        }

        if (nums.size()==1) res.add(nums.get(0));
        if (nums.size()>1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                res.add(nums.get(0));

            }

            if (nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)){
                res.add(nums.get(nums.size()-1));
            }


        }
        return res;
    }

    public static void main(String[] args) {
        lonelyNo obj = new lonelyNo();
        ArrayList<Integer> list2 =
                new ArrayList<>(Arrays.asList(1, 3, 5, 3));
        System.out.println("Test 2: " + obj.findLonely(list2));
    }
}
