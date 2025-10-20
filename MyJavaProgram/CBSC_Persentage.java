import java.util.Scanner;

public class CBSC_Persentage {
    public static void main(String[] args) {
        System.out.println("CBSC Result 2024");


        String name= "Prasad Mhetre";
        System.out.println(name);


        Scanner sc =new Scanner(System.in);
        System.out.println("enter the marks of obtain in physics:- ");
        int physics = sc.nextInt();

        System.out.println("enter the marks of obta89in in chemistry:- ");
        int chemistry= sc.nextInt();

        System.out.println("enter the marks of obtain in mathimatics:- ");
        int mathimatics= sc.nextInt();

        System.out.println("enter the marks of obtain in english:- ");
        int english=sc.nextInt();

        System.out.println("enter the marks obtain in biology:-");
        int biology=sc.nextInt();

        float persantage =((physics+chemistry+biology+english+mathimatics)/500.0f)*100;

        System.out.println(name + "has obtain persentage in CBSC board is" + persantage );










    }
}
