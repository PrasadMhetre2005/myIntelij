package DSAbyShraddha.DIvidAndConqerer;

import java.awt.geom.QuadCurve2D;

import static DSAbyShraddha.DIvidAndConqerer.margesort.printArray;

public class QuickShort {
    public static void quickShort(int arr[],int si, int ei){

        if (si<ei){

            int pariDx=partation( arr,si,ei);
            quickShort(arr,si,pariDx-1);
            quickShort(arr,pariDx+1,ei);

        }

    }
    public static int partation(int[] arr, int si, int ei){

        int pivot=arr[ei];
        int i=si-1;
        for (int j=si;j<ei;j++){
            if (arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;


            }
            i++;
            int temp = pivot;

            arr[ei] = arr[i];
            arr[i] = temp;

        }
        i++;
        int temp = pivot;

        arr[ei] = arr[i];
        arr[i] = temp;


        return i;



    }
    public static void main(String[] args) {
        int arr[]={3,5,2,1,8,4};
        quickShort(arr,0, arr.length-1);
        printArray(arr);

    }
}
