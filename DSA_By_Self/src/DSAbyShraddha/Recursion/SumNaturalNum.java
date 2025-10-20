package DSAbyShraddha.Recursion;

import java.util.Scanner;

public class SumNaturalNum {
    public static int printsum(int num){
        if (num==1){

            return 1;
        }
        return num+printsum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number for sum  ");
        int num=sc.nextInt();
        System.out.println(printsum(num));

    }
}
