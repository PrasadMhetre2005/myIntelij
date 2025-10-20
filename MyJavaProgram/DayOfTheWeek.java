import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        int day;
        Scanner scanner=new Scanner(System.in);
        System.out.println("for the day choose the number from given\n 1\n 2\n 3\n 4\n 5\n 6\n 7\n2");
        day=scanner.nextInt();
        switch (day){
            case 1-> System.out.println("monday");
            case 2-> System.out.println("tuesday");
            case 3-> System.out.println("wensday");
            case 4-> System.out.println("thusday");
            case 5-> System.out.println("friday");
            case 6-> System.out.println("satrday");
            case 7-> System.out.println("sunday");

        }
    }
}
