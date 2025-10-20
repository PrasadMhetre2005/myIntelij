import java.security.SecureRandom;

public class My_Stringe {
    public static void main(String[] args) {
        String name="   prasad    mhetre =   ";
        System.out.println(name);
        int lstring= name.length();
        System.out.println(lstring);
        String lower =name.toLowerCase();
        System.out.println(lower);

        String upper = name.toUpperCase();
        System.out.println(upper);

        String trim= name.trim();
        System.out.println(trim);{
            String name2 = "sarthak mhetre";

            System.out.println(name2.substring(4,7));
            System.out.println(name2.replace("sarthak","prasad"));


        }


    }
}
