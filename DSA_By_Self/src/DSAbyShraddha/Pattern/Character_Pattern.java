package DSAbyShraddha.Pattern;

import java.util.Scanner;

public class Character_Pattern {

    public static void main(String[] args) {
        char chr ='A';
        System.out.println("enter the number of line");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int line=1;line<=rows;line++){
            for (int j=1 ;j<=line ; j++){
                System.out.print(" "+chr+" ");
                chr++;
            }
            System.out.println(" ");
        }
    }
}
