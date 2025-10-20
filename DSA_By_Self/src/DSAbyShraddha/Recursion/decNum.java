package DSAbyShraddha.Recursion;

public class decNum {
    public static void printDecNum(int num){
        if (num==1){
            System.out.print(num+" ");
            return;
        }
        System.out.print(num+" ");
        printDecNum(num-1);


    }
    public static void main(String[] args) {
        int num=5;
        printDecNum(num);
    }
}
