package DSAbyShraddha.TwoDArrays;

public class Srch_In_Srt_Matrix {
    public static boolean srchkey_In_sortMatrix(int[][] matrix,int key){

       int row=0 ,colm=matrix[0].length-1;

       while (row<matrix.length && colm>=0){
           if (key==matrix[row][colm]){
               System.out.println("key found at\nposition : ("+row +","+colm+")"+"--->"+key);
               return true;
           } else if (key<matrix[row][colm]) {
               colm--;

           }
           else {
               row++;
           }


       }
       return false;
    }
    public static void main(String[] args) {
            int matrix[][]={{1,2,3},
                            {4,5,6},
                            {7,8,9}};
            srchkey_In_sortMatrix(matrix,8);
    }
}
