import javax.xml.namespace.QName;
import java.util.Scanner;

class student {
        String name;
        int id;
        int age;
        public void info() {
//            System.out.println("name of student" + name);
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the name of student");
            String name = sc.nextLine();
            System.out.println("student name:-" + name);
            System.out.println("enter the id of student");
            int id = sc.nextInt();
            System.out.println("student name:-" + id);
            System.out.println("enter the age of student");
            int age = sc.nextInt();
            System.out.println("student name:-" + age);
//            System.out.println("age of student"+ age);
//            System.out.println("id number is" + id);
        }

}
public class oppLec_01 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("information of student");


        student inform2=new student();
        student inform3=new student();
        student inform4=new student();

         inform2.info();
         inform3.info();
         inform4.info();



    }
}


