package DSAbyShraddha.Strings;

import java.util.Locale;
import java.util.Scanner;

public class palindromCheck {
    public static void palindromCheck(String str){

        str=str.toLowerCase();
        String rev="";
        for (int i =str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);



       }
        if (str.equals(rev)){
            System.out.println("the given string are palindrom"+rev);

        }
        else {
            System.out.println("string is not palindrom \n return correct String");
        }


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str=sc.nextLine();
        palindromCheck(str);

    }
}
