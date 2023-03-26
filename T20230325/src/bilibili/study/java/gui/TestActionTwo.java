package bilibili.study.java.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-26
 * Time: 11:14
 */
public class TestActionTwo {
    public static void main(String[] args) {
        //两个按钮实现同一个监听
        Frame frame = new Frame("Test two button");
        frame.setBounds(300, 300, 500, 500);
        frame.setLayout(new GridLayout(1, 2));

        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        MyMonitor myMonitor = new MyMonitor();
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);
        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyMonitor implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        //e.getActionCommand() 获得按钮信息
        System.out.println("按钮被点击了");
        if (e.getActionCommand().equals("start")) {
            System.out.println("点击了开始");
        } else if (e.getActionCommand().equals("stop")) {
            System.out.println("点击了停止");
        }
    }
}
