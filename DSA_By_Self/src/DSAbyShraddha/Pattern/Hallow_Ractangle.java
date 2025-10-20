package DSAbyShraddha.Pattern;

import java.rmi.MarshalledObject;

public class Hallow_Ractangle {


    public static void Hallow_Ractangle(int n){
        for (int line =1 ;line<=n;line++){
            for (int rows =1 ; rows<=n ;rows++){
                if(line==1 || line==n|| rows==1 || rows==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.println();


        }

    }
    public static void main(String[] args) {
       Hallow_Ractangle(5);

    }
}
