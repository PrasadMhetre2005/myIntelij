import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

class loops {
    public static void main(String[] args) {
        int [] [] num ;
        num=new int[2][3];
        num[0][0] = 134;
        num[0][1] = 135;
        num[0][2] = 136;
        num[1][0] = 137;
        num[1][1] = 138;
        num[1][2] = 139;

        for(int i=0;i< num.length;i++){
            for(int j=0;j< num[i].length; j++){
                System.out.println(num[i][j]);
                System.out.print(" ");

            }
            System.out.println(" ");

        }



    }
}
