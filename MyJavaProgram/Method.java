import java.util.Scanner;

public class Method {
        static int logic( int x,int y){
            int z;
            if( x>y){
                z=2*(x+y);

            }
            else {
                z=5*(x+y);

            }
            return z;

        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b= sc.nextInt();
            int c;

            c=logic(a,b);


            System.out.printf("the value of %d and %d is %d ",a,b,c);
    }


    }



