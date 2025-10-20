package DSAbyShraddha.Arrays;

public class Sub_Array {
    public static void Sub_Array(int number[]){
        for (int i=0 ;i<number.length;i++){

            for (int j=i;j<number.length;j++){

                for (int print=i;print<=j;print++){
                    System.out.print(number[print]+" ");

                }
                System.out.println(" ");

            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args) {
        int [] number={2,34,54,3,7,5,43,22,};
        Sub_Array(number);
    }
}
