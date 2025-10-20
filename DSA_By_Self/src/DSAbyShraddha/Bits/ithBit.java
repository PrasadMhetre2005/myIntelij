package DSAbyShraddha.Bits;

public class ithBit {
    public static int getItBit(int n,int i){
        int bitmask=1<<i;
        if ((n&bitmask)==0){
            return 0;

        }
        else {
            return 1;
        }



    }
    public static void main(String[] args) {
        int i=2;
        System.out.println(getItBit(10,i));

    }
}
