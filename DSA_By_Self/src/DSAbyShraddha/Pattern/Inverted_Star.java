package DSAbyShraddha.Pattern;

import java.util.Scanner;

public class Inverted_Star {

    public static void Inverted_Star(int n){

        for (int i =1 ; i<=n ;i++ ){
            for(int star=1; star<=n-i+1; star++){
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lines which you want to print");
        int n = sc.nextInt();
        Inverted_Star(n);
    }

}
