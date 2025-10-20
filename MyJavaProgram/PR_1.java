public class PR_1 {
    static int Nsum(int x){
    if(x==1){
        return 1;
    }
    else {
    return x+Nsum(x-1);
    }
    }

    public static void main(String[] args) {
        System.out.println(Nsum(3));

    }

}
