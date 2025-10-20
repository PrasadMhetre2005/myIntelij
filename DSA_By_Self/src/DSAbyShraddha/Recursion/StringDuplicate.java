package DSAbyShraddha.Recursion;

public class StringDuplicate {
    public  static void removeDup(String str ,int inx ,StringBuilder newstr,  boolean [] Map){
        if (inx==str.length()){
            System.out.println(newstr);
            return;
        }

        char currchar =str.charAt(inx);
        if (Map[currchar-'a']==true){
            removeDup(str,inx+1,newstr,Map);
        }
        else {
            Map[currchar-'a']=true;
            removeDup(str,inx+1,newstr.append(currchar),Map);

        }


    }

    public static void main(String[] args) {
        String str = "sknsits";

        removeDup(str,0,new StringBuilder(""),new boolean[26] );
    }
}
