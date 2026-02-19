package DSAbyShraddha.sorting;

import java.util.Collections;


import static java.util.Collections.swap;

public class SelectionSort {
    public void selectionArray(int []number){
        int n=number.length;
        for (int i=0;i<n-1;i++){
            int minpos=i;
            for (int j=i+1;j<=n-1;j++){
                if(number[minpos]>number[j]){
                    minpos=j;
                }

            }
            int temp=number[minpos];
            number[minpos]=number[i];
            number[i]=temp;

        }

    }


    public static void printSortArray(int[] number){
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+"  ");
        }


    }




    public static void main(String[] args) {
        int number[] ={23,34,45,46,12,11};
        SelectionSort obj = new SelectionSort();
        obj.selectionArray(number);
        obj.printSortArray(number);
        System.out.println();

        revrs_number obj1 = new revrs_number();
        obj1.Revs_selection(number);
        SelectionSort.printSortArray(number);

    }
}
class revrs_number{

    static void Revs_selection(int[] arr){

        for (int i=0;i< arr.length-1;i++){

            int maxpos=i;
            for (int j=i+1; j< arr.length;j++){
                if (arr[maxpos]<arr[j]){
                    maxpos=j;

                }

            }

            int temp=arr[maxpos];
            arr[maxpos]=arr[i];
            arr[i]=temp;
        }
    }
}