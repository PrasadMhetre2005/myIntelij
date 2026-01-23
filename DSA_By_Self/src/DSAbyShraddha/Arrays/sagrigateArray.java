package DSAbyShraddha.Arrays;

public class sagrigateArray {

    static void sagrigateArray(int arr[]){

        int first=0;
        int last=arr.length-1;

        while (first<last){
            if (arr[first]==0) first++;


        }
        while (first<last){
            if (arr[last]==1) last--;
        }

        while (first<last ){
            if (arr[first]==1 && arr[last]==0){
                arr[first]=0;
                arr[last]=1;
                last--;
                first++;
            }

        }
    }

    public static void main(String[] args) {
        int arr[]= {0,1,0,1,1,0,0};
        sagrigateArray(arr);

        for (int i:arr){
            System.out.println(i);
        }
        }
    }

