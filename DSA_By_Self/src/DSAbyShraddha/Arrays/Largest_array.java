package DSAbyShraddha.Arrays;

public class Largest_array {

    public int Largest_num(int numbers[]){
        int larhgest=0;
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<numbers.length;i++){

            if(larhgest<numbers[i]){

                larhgest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }

        }

        System.out.println("the smallest no in array "+smallest);
        return larhgest;


    }

    public static void main(String[] args) {
        int numbers[] ={23,45,67,78,54};
        Largest_array obj = new Largest_array();
        System.out.println("the largest no is "+obj.Largest_num(numbers));
    }

}
