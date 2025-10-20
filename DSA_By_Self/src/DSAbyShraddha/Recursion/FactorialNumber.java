package DSAbyShraddha.Recursion;

public class FactorialNumber {
    public static int printFact(int n){
        if(n==0){

            return  1;
        }



        return n*printFact(n-1);
    }

    public static void main(String[] args) {
        int num =5;
        System.out.println(printFact(num));

    }
}
