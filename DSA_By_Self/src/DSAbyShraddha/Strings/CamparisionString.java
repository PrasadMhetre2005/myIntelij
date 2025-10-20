package DSAbyShraddha.Strings;

import java.util.Scanner;

public class CamparisionString {

    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        System.out.println("enter the string 1");
        String str1 = dc.nextLine();
        System.out.println("enter the string 2");
        String str2 = dc.nextLine();

        String str3 = new String(dc.nextLine());

        if (str1.equals(str2)){
            System.out.println("string are same :");

        }
        else {
            System.out.println("not same :");
        }
        if(str1.equals(str3)){
            System.out.println("string are same :");

        }
        else {
            System.out.println("not same :");
        }
    }

}
