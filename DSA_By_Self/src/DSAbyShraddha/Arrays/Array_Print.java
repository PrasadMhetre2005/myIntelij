package DSAbyShraddha.Arrays;

public class Array_Print {

    public static void Array_print(int []marks){

        for(int i=0 ; i<marks.length; i++){
            marks[i]=marks[i]+1;
            System.out.print(" "+marks[i]+" ");


        }
        System.out.println("");
//        System.out.println(marks);
    }

    public static void main(String[] args) {
        int marks[]={45,56,76,76};


        for (int mark :marks){
            System.out.print(" "+ mark +" ");
        }
        System.out.println("");
        Array_print(marks);
    }
}

