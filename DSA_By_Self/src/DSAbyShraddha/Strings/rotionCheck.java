package DSAbyShraddha.Strings;

public class rotionCheck {

    static boolean Checkrotaion(String s1, String s2){
        int length = s1.length();

        for (int i=0;i<length;++i){
            if (s1.equals(s2)) return true;
            char last = s1.charAt(s1.length()-1);
            s1=last+s1.substring(0,s1.length()-1);
        }





        return  false;
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aba";

        System.out.println(Checkrotaion(s1, s2));
    }
}
