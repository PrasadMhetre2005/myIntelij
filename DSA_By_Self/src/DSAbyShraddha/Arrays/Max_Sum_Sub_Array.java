package DSAbyShraddha.Arrays;

public class Max_Sum_Sub_Array {



        public static void Sub_Array(int number[]) {
            int maxSum = Integer.MIN_VALUE; // to keep track of maximum sum

            for (int i = 0; i < number.length; i++) {
                for (int j = i; j < number.length; j++) {
                    int currSum = 0; // reset for each subarray

                    // sum of subarray from i to j
                    for (int k = i; k <= j; k++) {
                        currSum += number[k];

                    }
                    System.out.println(currSum);

                    // check if this subarray sum is greater than max
                    if (maxSum < currSum) {
                        maxSum = currSum;
                    }
                }
            }

            System.out.println("Maximum Subarray Sum = " + maxSum);
        }

        public static void main(String[] args) {
            int[] number = {1, 2, 3};
            Sub_Array(number);
        }


}
