package bilibili.study;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-26
 * Time: 10:59
 */
public class TestActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TestActionListener");
        frame.setBounds(300, 300, 500, 500);

        JButton button = new JButton("这是一个按钮");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("控制台输出：点击了按钮");
            }
        });

        frame.add(button);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
