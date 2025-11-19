package DSAbyShraddha.ArrayList;

import java.util.ArrayList;

public class ArrayList_Cret {


    public void reversList(ArrayList<Integer> list){
        for (int i= list.size()-1; i>=0;i--){

            System.out.print(list.get(i)+" ");
        }
        System.out.println(" ");

    }

    public void findMax(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max= list.get(i);

            }
            System.out.println("maximum element is  " + max);
        }
    }
    public void swapNO(ArrayList<Integer> list, int inx1,  int inx2 ) {


        for (int i = 0; i < list.size(); i++) {

            int temp= list.get(inx1);
            list.set(inx1, list.get(inx2));
            list.set(inx2,temp);


            System.out.println();

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int ele=list.get(2);
        System.out.println(ele);

        list.remove(2);
        System.out.println(list);

        list.set(2,5);
        System.out.println(list);

        ArrayList_Cret lst=new ArrayList_Cret();
        lst.reversList(list);
        lst.findMax(list);
        lst.swapNO(list,0,1);



    }
}
