import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-28
 * Time: 16:00
 */
public class TestJFrame {
    public static void main(String[] args) {
        new MyJFrame("框架");
    }
}

class MyJFrame extends JFrame {
    MyDialog myDialog;

    public MyJFrame(String title) throws HeadlessException {
        super(title);
        setBounds(300, 300, 500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
