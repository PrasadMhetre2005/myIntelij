package DSAbyShraddha.DIvidAndConqerer;

public class margesort {

    public static void mergeSort(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }
        int mid =si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        mergeSort(arr,si,mid,ei);

    }

    public static void mergeSort(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                        i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=ei){
            temp[k++]=arr[j++];
        }

        for (k=0,i=si;k< temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,2,8};
        int si=0;
        int ei= arr.length-1;
        int mid=si+(ei-si)/2;

        mergeSort(arr,si,ei);
        printArray(arr);


    }
}
