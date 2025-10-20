package DSAbyShraddha.Recursion;

public class CheckSortedArray {
    public static boolean CheckSortedArray(int [] arr,int i){
        if (i==arr.length){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return CheckSortedArray(arr,i+1);

    }
    public static void main(String[] args) {
        int arr[]={1,23,45,67,78,23};
        boolean check=CheckSortedArray(arr,0);
        System.out.println(check);


    }
}
