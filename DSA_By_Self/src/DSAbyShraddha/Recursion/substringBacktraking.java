package DSAbyShraddha.Recursion;

public class substringBacktraking {

    public static void SubStringPrint(String str,String result,int i){

        if (i==str.length()){
            System.out.println(result);
            return;
        }

        SubStringPrint(str,result+str.charAt(i),i+1);
        SubStringPrint(str,result,i+1);
    }



        public static void main(String[] args) {
            String str ="prasad";
            SubStringPrint(str,"",0);


        }
    }
