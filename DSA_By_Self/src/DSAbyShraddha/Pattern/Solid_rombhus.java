package DSAbyShraddha.Pattern;

public class Solid_rombhus {
    public static void Solid_rombhus(int n){

        for(int line=1 ;line<=n;line++){
            for (int space=1; space<=n-line;space++){
                System.out.print(" ");
            }
            for (int star=1; star<=n;star++){

                System.out.print("*");
            }
            System.out.println(" ");

        }
    }

    public static void main(String[] args) {
        Solid_rombhus(3);
    }
}
