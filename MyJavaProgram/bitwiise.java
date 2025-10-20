public class bitwiise {
    public static void main(String[] args) {
        byte a=12;
        byte b= 45;
        byte redsult;

        redsult =(byte) ~a;
        System.out.println("the result"+redsult);

        redsult =(byte) (a&b);
        System.out.println("the result"+redsult);
        redsult =(byte) (a>>2);
        System.out.println("the result"+redsult);
        redsult =(byte) (a|b);
        System.out.println("the result"+redsult);


    }
}
