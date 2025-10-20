package DSAbyShraddha.Recursion;

public class powerofX {
    public static int calPower(int number,int power){
        if (power==0){
            return 1;
        }
        int powerSqare =calPower(number ,power/2);
        int and=powerSqare*powerSqare;

        if(number%2==0){
            return powerSqare*calPower(number,power-1);
        }
        return 1;
    }
    public static void main(String[] args) {
        int number =3;
        int power=3;
    }
}
