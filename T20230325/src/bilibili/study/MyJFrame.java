package bilibili.study;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-25
 * Time: 21:06
 */
public class MyJFrame extends JFrame {
    static int id = 0;  //可能存在多个窗口，需要计数器

    public MyJFrame(int x, int y, int w, int h) {
        super("MyJFrame" + (++id));
        setBounds(x, y, w, h);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class TestMyJFrame {
    public static void main(String[] args) {
        MyJFrame frame1 = new MyJFrame(100, 100, 400, 400);
        MyJFrame frame2 = new MyJFrame(500, 100, 400, 400);
        MyJFrame frame3 = new MyJFrame(100, 500, 400, 400);
        MyJFrame frame4 = new MyJFrame(500, 500, 400, 400);
    }
}
