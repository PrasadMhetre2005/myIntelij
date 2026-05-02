package DSAbyShraddha.Arrays;

public class Canntainer_with_max_water {

    public int maxArea(int arr[]){

        int mArea=0;
        int i=0,j= arr.length-1;

        while (i<=j){

            int currArea = Math.min(arr[i],arr[j])*(j-i);
            mArea=Math.max(mArea,currArea);
            if(arr[i]<arr[j]) i++;
            else j--;
        }
        return mArea;

    }


}

