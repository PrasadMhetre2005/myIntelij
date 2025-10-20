package DSAbyShraddha.sorting;

public class bubbleSort {
    public static void Bubble_Sort(int number[]){
        for (int i=0;i<number.length-1;i++){
            for (int j=0;j<number.length-i-1;j++){
                if (number[j]>number[j+1]){
                    int temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                }
            }
        }


    }

    public static void main(String[] args) {
        int number[]= {56,45,65,23,76,45,32,44,55};
        Bubble_Sort(number);
        System.out.println("given is sorted array\n");
        for (int ele:number){
            System.out.print(ele+" ");
        }
    }
}
