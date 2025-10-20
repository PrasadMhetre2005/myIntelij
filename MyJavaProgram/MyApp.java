import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;
import java.util.Scanner;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class MyApp{
    public static void main(String[] args) throws AWTException, InterruptedException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the text");
        String msg=scanner.nextLine();
        System.out.println("how many times you want to send");
        int size= scanner.nextInt();

        StringSelection stringSelection= new StringSelection(msg);
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);



        Thread.sleep(Duration.ofMillis(5000));



        Robot robot= new Robot();
        for (int i=1;i<=size;i++){
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(Duration.ofMillis(100));



        }



    }
}