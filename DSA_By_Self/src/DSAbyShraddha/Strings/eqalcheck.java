package DSAbyShraddha.Strings;

public class eqalcheck {

    static boolean equal_check(String str1,String str2){

        if (str1.length()!=str2.length()) return false;


        for (int i=0;i<str1.length();i++){
            if (str1.charAt(i)!=str2.charAt(i)){
                return false;
            }

        }
        return true;
    }

    static String insertChar(String s, char c, int pos) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            // Insert the character at the given position
            if (i == pos)
                res.append(c);

            // Insert the original characters
            res.append(s.charAt(i));
        }

        // If the given pos is beyond the length,
        // append the character at the end
        if (pos >= s.length())
            res.append(c);

        return res.toString();
    }


    static String reverseString(String str){

        StringBuilder result=new StringBuilder(str);
        int left=0 ,right=str.length()-1;

        while(left<right){
            result.setCharAt(left,result.charAt(right));
            result.setCharAt(right,result.charAt(left));
            left++;
            right--;
        }
        return result.toString();
    }

    static boolean cheackIsanagram(String s1,String s2){

        if (s1.length()!=s2.length()) return false;

        int freq[] =new int[26];

        for (int i=0;i<s1.length();i++){

            freq[s1.charAt(i)-'a']++;
        }
        for (int i=0;i<s2.length();i++){

            freq[s2.charAt(i)-'a']--;
        }

        for (int count:freq){
            if (count!=0) return false;

        }



        return true;
    }



    public static void main(String[] args) {

        String str1 ="hello";
        String str2="ollhe";

        if (equal_check(str1,str2)) System.out.println("yes"); else System.out.println("wrong");

        String str="prasad";
        System.out.println(reverseString(str));


        if (cheackIsanagram(str1,str2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}




