package DSAbyShraddha.Pattern;

import java.util.Scanner;

public class Half_Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the numbers which you want to print");
        int n= sc.nextInt();
        for(int line =1 ;line<=n; line++){
            for(int numbers=1 ;numbers <=line ; numbers++){
                System.out.print(numbers);

            }
            System.out.println("");
        }
    }
}
