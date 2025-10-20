package DSAbyShraddha.Recursion;

import java.util.ArrayList;

public class BacktrakingBasic {

    public static void ArrPrint(int arr[],int inx,int val){

        if (inx== arr.length){
            PrintArr(arr);
            return;
        }
        arr[inx]=val;
        ArrPrint(arr,inx+1,val+2);
        arr[inx]=arr[inx]-2;
    }

    public static void PrintArr(int arr[]){
        for(int i=0;i< arr.length-1;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        ArrPrint(arr,0,1);
        PrintArr(arr);

    }
}
