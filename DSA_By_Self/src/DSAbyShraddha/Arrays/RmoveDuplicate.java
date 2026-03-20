package DSAbyShraddha.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}

public class RmoveDuplicate {
    public static void main(String[] args) {

        LenghtOfLastWords obj=new LenghtOfLastWords();
        obj.lengthOfLastWord("i am prasad");

    }
}

class LenghtOfLastWords{
    public int lengthOfLastWord(String s) {
        String arr[]=s.trim().split(" ");

        int x= arr.length;

        int lastword=arr[x-1].length();


        return lastword;



    }
}