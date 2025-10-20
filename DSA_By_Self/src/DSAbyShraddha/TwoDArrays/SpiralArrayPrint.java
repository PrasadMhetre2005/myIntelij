package DSAbyShraddha.TwoDArrays;

public class SpiralArrayPrint {

    public static void PrintSpral(int matrix[][]){
        int strRow= 0;
        int strCol=0;
        int endrow= matrix.length-1;
        int endcol= matrix[0].length-1;

        while (strRow<=endrow && strCol<=endcol){
            //top
            for (int j=strCol;j<=endcol;j++){
                System.out.print(matrix[strRow][j]+" ");
            }
            //right
            for (int i=strRow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");

            }
            //bottom
            for (int j=endcol-1;j>=strCol;j--){
                if (strRow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for (int i=endrow-1;i>=strRow+1;i--){
                if (strCol==endcol){
                    break;
                }
                System.out.print(matrix[i][strCol]+" ");
            }

            strRow++;
            endrow--;
            strCol++;
            endcol--;


        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={  {12,23,34,23,},
                          {45,34,45,22},
                          {12,23,43,62},
                          {23,81,19,18}    };
        PrintSpral(matrix);





    }
}
