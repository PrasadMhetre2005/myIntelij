package DSAbyShraddha.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

     public static int LongestSub(String s){

         Set <Character> set = new HashSet<>();
         int max=0;
         int i=0;

         for (int j=0 ;j<s.length();j++){

             char ch = s.charAt(j);

             while (set.contains(ch)){
                 set.remove(s.charAt(i));
                 i++;

             }

             set.add(ch);

             int len= j-i+1;

             max=Math.max(max,len);

         }

         return max;



     }
}
