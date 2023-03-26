package bilibili.study;

import jdk.nashorn.internal.scripts.JD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-27
 * Time: 0:07
 */
public class TestDialog {
    public static void main(String[] args) {
        JFrame frame = new JFrame("测试弹出窗口");
        frame.setBounds(300, 300, 500, 500);


        //JFrame，存放东西，容器
        Container container = frame.getContentPane();// 获取窗体容器,container(容器)
        JButton button = new JButton("点击这里弹出窗口");
        container.add(button);

        button.addActionListener(new ActionListener() {

            JDialog jDialog = new JDialog();
            JLabel label = new JLabel("这里是弹窗");
            @Override
            public void actionPerformed(ActionEvent e) {
                jDialog.setBounds(300, 300, 200, 200);
                jDialog.setModal(true);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                jDialog.add(label);
                jDialog.setVisible(true);
            }
        });


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
