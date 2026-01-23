package DSAbyShraddha.Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class addOne {
    Vector<Integer> Addone(int arr[]){

        Vector<Integer> res = new Vector<>();
        int n = arr.length;

        int carry=1;
        for (int i=n-1; i>=0;i--){

            if (arr[i]+carry<=9){ res.add(arr[i]+carry); carry=0;}
            else {res.add(0); carry=1;}

            if (carry==1){
                res.add(1);
            }
        }

        Collections.reverse(res);
        return res;
    }



}
