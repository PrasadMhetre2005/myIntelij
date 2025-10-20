package DSAbyShraddha.sorting;

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
    public void printSortArray(int[] number){
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+"  ");
        }


    }




    public static void main(String[] args) {
        int number[] ={23,34,45,46,12,11};
        SelectionSort obj = new SelectionSort();
        obj.selectionArray(number);
        obj.printSortArray(number);
    }
}