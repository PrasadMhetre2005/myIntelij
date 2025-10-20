package DSAbyShraddha.Recursion;

public class BinaryString {
    public static void PrintBinaryNum(int n,int lastplace,String str){
        if (n==0){
            System.out.println(str);
            return;
        }
        PrintBinaryNum(n-1,0,str+"0");
        if (lastplace==0){
            PrintBinaryNum(n-1,1,str+"1");

        }
    }
    public static void main(String[] args) {
        PrintBinaryNum(3,1,"");
    }
}
