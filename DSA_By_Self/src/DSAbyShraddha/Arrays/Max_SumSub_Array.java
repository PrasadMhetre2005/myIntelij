package DSAbyShraddha.Arrays;

public class Max_SumSub_Array {

    public static void SUMSUB_Array(int[] number){
        int currsum =0;
        int Maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];
        prefix[0]=number[0];
        for (int i=1 ;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for (int i = 0; i< number.length; i++){
            for (int j=i;j<number.length;j++){
                currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];

                if (Maxsum<currsum){
                    Maxsum=currsum;
                }
               
            }
        }
        System.out.println("max sum Array "+Maxsum);


    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};
        SUMSUB_Array(number);

    }
}