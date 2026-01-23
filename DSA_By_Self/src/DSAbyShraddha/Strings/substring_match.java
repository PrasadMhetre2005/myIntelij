package DSAbyShraddha.Strings;

public class substring_match {

    static int subfind(String str, String pat){

        int n=str.length();
        int m= pat.length();

        for (int i=0;i<n-m;i++){
            int j;
            for ( j=0;j<m;j++){

                if (str.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if (j==m){

                return i;
            }
        }

        return -1;

    }
}
