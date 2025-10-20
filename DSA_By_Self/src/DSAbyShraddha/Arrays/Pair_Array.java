package DSAbyShraddha.Arrays;

public class Pair_Array {
    public static void pair_array(int number[]){

        for (int i=0; i<number.length-1;i++){
            int current =number[i];
            for (int j=i+1; j<number.length;j++){

                System.out.printf("(%d,%d) ",number[i],number[j]);
            }
            System.out.println("");


        }

    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,7,6,7,8};
        pair_array(number);
    }
}
