package DSAbyShraddha.Arrays;

public class Binary_search {

    public static int binary_search(int number[], int key){

        int start= 0;
        int end=number.length-1;
         while (start<=end){
             int mid =(start+end)/2;
             if (number[mid]==key){
                 return mid;

             }
             if (number[mid]>key){
                 end=mid-1;
             }
             else {
                 start=mid+1;
             }
         }
         return -1;
    }

    public static void main(String[] args) {
        int number[] ={23,45,56,67,78,89,99,};
        int key=99;

        System.out.println("index for key is \n"+ binary_search(number,key) +" \nand the value of key is \n"+key);
    }
}
