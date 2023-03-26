package bilibili.study.java.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-26
 * Time: 19:05
 */
public class TestPaint extends Frame {
    public static void main(String[] args) {
        new MyPaint().loadMypaint();

    }
}

class MyPaint extends Frame{
    public void loadMypaint() {
        setBounds(300, 300, 500, 500);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        //设置颜色
        g.setColor(Color.red);


        g.drawOval(150, 150, 100, 100);

    }
}
