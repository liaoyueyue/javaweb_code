package bilibili.program.simple;

import java.awt.*;
import java.awt.event.*;

/**
 * Created with IntelliJ IDEA.
 * Description:简单计算器
 * User: liaoyueyue
 * Date: 2023-03-26
 * Time: 14:07
 */

//计算机类
public class Calculator extends Frame {

    //三框文本框、一个按钮、一标签
    TextField n1, n2, sum;
    Button equalSign;
    Label plusSign;

    public void loadFrame() {
        //设置标题
        setTitle("简易加法器");

        //配置框架布局
        setLayout(new FlowLayout());

        //配置文本框和按钮
        n1 = new TextField(10);
        plusSign = new Label("+");
        n2 = new TextField(10);
        equalSign = new Button("=");
        sum = new TextField(20);

        //搭建文本框和按钮
        add(n1);
        add(plusSign);
        add(n2);
        add(equalSign);
        add(sum);

        //设置等于按钮监听
        equalSign.addActionListener(new MyActionListener());

        //设置自动布局、显示框架、关闭框架
        pack();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("退出加法器");
                System.exit(0);
            }
        });
    }

    //监听器类
    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("开始计算加法：" + n1.getText() + "+" + n2.getText() + "=?");
            int x = Integer.parseInt(n1.getText());
            int y = Integer.parseInt(n2.getText());
            sum.setText(""+ (x+y));
            System.out.println("结果为：" + sum.getText());
            n1.setText("");
            n2.setText("");
        }
    }
}

class Test {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}
