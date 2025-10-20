package DSAbyShraddha.Strings;

public class SubString {
    public static String substring(String str,int sp,int ep){
        String substring="";
        for (int i=sp;i<ep;i++){
            substring+=str.charAt(i);
        }
        return substring;
    }
    public static void main(String[] args) {
        String str = "hello this is sub string";
        String printSubString=substring(str,0,4);
        System.out.println(printSubString);



    }
}
