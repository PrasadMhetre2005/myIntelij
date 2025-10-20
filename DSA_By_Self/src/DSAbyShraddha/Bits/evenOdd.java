package DSAbyShraddha.Bits;

import java.util.Scanner;

public class evenOdd {
    public static void CheckEvenOdd(int n){
        int bitmask=1;
        if ((n & bitmask)==0){
            System.out.println("the given number "+ n+ " is even");

        }
        System.out.println("the number "+n+ " is odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the any integer number");
        int number = sc.nextInt();
        CheckEvenOdd(number);
    }
}
