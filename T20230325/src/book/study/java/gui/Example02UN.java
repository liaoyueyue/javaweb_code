package book.study.java.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-25
 * Time: 17:33
 */
public class Example02UN extends JDialog {
    public static void main(String[] args) {
        //建立两个按钮
        JButton btn1 = new JButton("模态对话框");
        JButton btn2 = new JButton("非模态对话框");
        JFrame f = new JFrame("DialogDemo");
        f.setSize(300, 250);
        f.setLocation(300, 200);
        f.setLayout(new FlowLayout());  //为内容面板设置布局管理器
        //在Container对象上添加按钮
        f.add(btn1);
        f.add(btn2);
        //设置单击关闭按钮关闭窗口
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        //label:标签
        final JLabel label = new JLabel();

        //定义一个JDialog对话框
        final JDialog dialog = new JDialog(f, "Dialog");
        dialog.setSize(220, 150);
        dialog.setLocation(350, 250);
        dialog.setLayout(new FlowLayout()); //设置布局管理器
        final JButton btn3 = new JButton("确定");
        dialog.add(btn3);
        //为"模态对话框"添加单击事件
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //设置对话框为模态
                dialog.setModal(true);
                //如果JDialog窗口中没有添加JLabel标签，就把JLael加上
                if (dialog.getComponents().length == 1) {
                    dialog.add(label);
                }
                //否则修改标签的内容
                label.setText("模态对话框，单击确认关闭");
                //显示对话框
                label.setVisible(true);
            }
        });

        //为非模态对话框按钮添加单击事件
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //设置对话框为非模态
                dialog.setModal(false);
                //如果JDialog窗口中没有添加JLabel标签，就把JLabel标签加上
                if (dialog.getComponents().length == 1) {
                    dialog.add(label);
                }
                //否则修改标签的内容
                label.setText("非模态对话框，单击确认关闭按钮");
                //显示对话框
                label.setVisible(true);
            }
        });

        //为对话框中的按钮添加单击事件
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
    }
}
