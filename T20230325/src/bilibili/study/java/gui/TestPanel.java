package bilibili.study.java.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-25
 * Time: 21:37
 */
public class TestPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //layout 布局
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(Color.PINK);
        Panel panel = new Panel();
        //设置窗口坐标大小相对于frame
        panel.setBounds(50, 30, 400, 400);
        panel.setBackground(Color.cyan);
        frame.add(panel);
        frame.setVisible(true);
        //监听事件，监听窗口关闭事件
        //adapter 适配器
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
