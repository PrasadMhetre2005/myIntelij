package DSAbyShraddha.Arrays;

import java.util.Scanner;

public class Arrayscc {

    public static void main(String[] args) {
        int marks[] = new int[50];
        int number[]={1,2,3};


        String fruits[] ={"mango", "banana", "apple"};

        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();
        marks[5]=sc.nextInt();
        marks[6]=sc.nextInt();

        System.out.println("phy  "+marks[0]);
        System.out.println("chem  "+marks[1]);
        System.out.println("math  "+marks[2]);
        System.out.println("phy  "+marks[3]);
        System.out.println("phy  "+marks[4]);
        System.out.println("phy  "+marks[5]);
        
//        for(int mark: marks){
//            int array=marks[mark];
//            System.out.println(array);
//
//        }
    }
}
