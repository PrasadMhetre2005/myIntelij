import java.util.Scanner;

public class PassOrFail_ssc_board {
    public static void main(String[] args) {
        int s1, s2, s3, s4, s5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks in english");
        s1 = scanner.nextInt();

        System.out.println("enter the marks in physics");
        s2 = scanner.nextInt();

        System.out.println("enter the marks in mathimatics");
        s3 = scanner.nextInt();

        System.out.println("enter the marks in biology");
        s4 = scanner.nextInt();

        System.out.println("enter the marks in chemistry");
        s5 = scanner.nextInt();

        float persantage = (s1 + s2 + s3 + s4 + s5) / 5.0f;
        System.out.println("obtain persantage of student in ssc board i :-" + persantage);

        if (persantage >= 85) {
            System.out.println("outstanding student");



        }
        else if (persantage>=35 && s1>=35 && s2>=35 && s3>=35 && s4>=35 && s5>=35){
            System.out.println("student is pass in ssc board exam");

        }
        else {
            System.out.println("student is fail in ssc board exam");
        }



    }
}


