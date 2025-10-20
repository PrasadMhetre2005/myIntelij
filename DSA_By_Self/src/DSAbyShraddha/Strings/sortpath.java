package DSAbyShraddha.Strings;

import java.util.Scanner;

public class sortpath {
    public static int getsortpath(String path){
        int x=0,y=0;
        for (int i=0;i<path.length();i++){
            char dir =path.charAt(i);
            //south
            if (dir=='S'){
                y--;
            } else if (dir=='N') {
                y++;

            } else if (dir=='W') {
                x--;

            }
            else if (dir=='E'){
                x++;
            }
            else{
                System.out.println("invailed direction at index"+i+"-->"+dir);
                return -1;

            }
        }
        return (int)Math.sqrt((x*x)+(y*y));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entyer the direction to find shoretest path ");
        String path=sc.nextLine();

        int sortestpath= getsortpath(path);
        if(sortestpath!=-1){
            System.out.println("givan path  "+path);
            System.out.println("the distance  is  "+ sortestpath);

        }
        else {
            System.out.println("path cantain invaild candition\n "+"used only--->( E,W,S,N)");
        }






    }
}
