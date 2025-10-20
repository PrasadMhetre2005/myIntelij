import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {

        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number tou want to table");
        num= sc.nextInt();

        for(int i=1;i<=10;++i){
            System.out.printf("%d * %d =%d \n",num,i,num*i);
                }

    }
}
