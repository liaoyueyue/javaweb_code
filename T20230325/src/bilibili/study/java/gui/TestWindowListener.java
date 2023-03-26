package bilibili.study.java.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-26
 * Time: 20:25
 */
public class TestWindowListener {
    public static void main(String[] args) {
        new MyWindowListener("测试窗口监听");
    }
}

class MyWindowListener extends Frame {
    public MyWindowListener(String title) {
        super(title);
        setBounds(300, 300, 500, 500);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("窗口关闭中");
                System.exit(0);
            }

        });

    }
}
