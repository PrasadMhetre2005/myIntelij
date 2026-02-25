package DSAbyShraddha.Strings;

import java.lang.foreign.StructLayout;
import java.util.Stack;

public class ValidParanthesis {

    public static boolean check_valid(String str){

        Stack<Character> char_Num= new Stack<>();

        for (int i=0 ; i<str.length();i++){


            char ch= str.charAt(i);

            if (ch=='('||ch=='{'||ch=='[') char_Num.push(ch);
            else if (!char_Num.isEmpty()&&ch==')'&&char_Num.peek()=='(') {
                char_Num.pop();

            }

            else if (!char_Num.isEmpty()&&ch=='}'&&char_Num.peek()=='{') {
                char_Num.pop();

            }
            else if (!char_Num.isEmpty()&&ch==']'&&char_Num.peek()=='[') {
                char_Num.pop();

            }
            else return false;



        }
        return char_Num.isEmpty();
    }

    public static void main(String[] args) {
        String str ="(({(})))";
       ; // Valid example
        String str2 = "(({(})"; // Invalid example

        System.out.println("Is str valid? " + check_valid(str));  // Output: true
        System.out.println("Is str2 valid? " + check_valid(str2));

    }
}
