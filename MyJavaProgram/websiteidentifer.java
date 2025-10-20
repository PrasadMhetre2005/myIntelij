import java.util.Scanner;

public class websiteidentifer {
    public static void main(String[] args) {
        Scanner webname= new Scanner(System.in);
        String name ="enter the name of the wb";
        System.out.println(name);

        String website= webname.nextLine();

        if(website.endsWith(".org")){
            System.out.println("given website is organisation website");


    }
        else if (website.endsWith(".in")) {
            System.out.println("given website is indian website");
        }
        else if (website.endsWith(".com")) {
            System.out.println("given website is comarsial website");
        }

        }

    }
