public class VarArg {

    static int sum(int x,int ...arr){
        int result=0;
    for (int a: arr){
         result+=a;

    }
    return result;
    }
    public static void main(String[] args) {
        System.out.println(" welcome to VarArg");
        System.out.println("the sum of a and b is ="+ sum(34,67));
        System.out.println("the sum of a and b is ="+ sum(34,67,56));
        System.out.println("the sum of number "+ sum(34,89,65,67,67,45));
        System.out.println(sum(34));

    }
}
