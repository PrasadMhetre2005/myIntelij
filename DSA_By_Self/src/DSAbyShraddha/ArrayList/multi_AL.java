package DSAbyShraddha.ArrayList;

import java.util.ArrayList;

public class multi_AL {

    public void ListOFlist(){


    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);

        mainList.addLast(list1);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(9);
        list2.add(10);
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);

        mainList.add(list2);

        for (int i =0 ;i<mainList.size();i++){
            ArrayList<Integer> currlist=mainList.get(i);

            for (int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println("");
        }

    }
}
