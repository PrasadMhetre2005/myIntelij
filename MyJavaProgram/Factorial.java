import java.util.Scanner;

public class Factorial {
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
//                return product;

            }
        return product*fact(n-1);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no which you want find the factorial");
        int x= sc.nextInt();
        System.out.println("the factorial of the no is"+ fact(x));
    }
}
