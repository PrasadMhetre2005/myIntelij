    package DSAbyShraddha.Arrays;

    public class Rev_array {

        public static void rev_Array(int number[]){
            int first=0;
            int last=number.length-1;
            while (first<last){

                int temp=number[last];
                number[last]=number[first];
                number[first]=temp;

                first++;
                last--;

            }
        }


        public static void main(String[] args) {
            int number []= {2,34,54,67,56,45};

            rev_Array(number);

            for (int element: number){

                System.out.print(" "+element);
            }


        }
    }
