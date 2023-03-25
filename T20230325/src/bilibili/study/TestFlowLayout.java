package bilibili.study;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-25
 * Time: 22:04
 */
public class TestFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("测试流式布局");
        frame.setBounds(400, 400, 500, 500);
//        frame.setLayout(new FlowLayout());
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));


        //组件 按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
