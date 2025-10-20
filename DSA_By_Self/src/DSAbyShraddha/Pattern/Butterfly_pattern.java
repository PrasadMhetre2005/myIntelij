package DSAbyShraddha.Pattern;

public class Butterfly_pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int line =1;line<=n;line++){
            for (int first=1 ; first<line;first++){
                System.out.print("*");
            }
            for (int space =1;space<2*(n-line);space++){
                System.out.print(" ");
            }
            for (int second=1 ; second<line;second++) {
                System.out.print("*");
            }
            System.out.println();


        }
        for(int line =n;line>=1;line--){
            for (int first=1 ; first<line;first++){
                System.out.print("*");
            }
            for (int space =1;space<2*(n-line);space++){
                System.out.print(" ");
            }
            for (int second=1 ; second<line;second++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
