package bilibili.homework;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-25
 * Time: 23:20
 */
public class  Practise1{
    public static void main(String[] args) {
        JFrame frame = new JFrame("homework");
        frame.setBounds(300, 300, 900, 500);
        frame.setLayout(new GridLayout(2, 3));

        Button btn1 = new Button("button");
        Button btn2 = new Button("button");
        Button btn3 = new Button("button");
        Button btn4 = new Button("button");
        Button btn5 = new Button("button");
        Button btn6 = new Button("button");
        Button btn7 = new Button("button");
        Button btn8 = new Button("button");
        Button btn9 = new Button("button");
        Button btn10 = new Button("button");

        Panel panel1 = new Panel(new GridLayout(2, 1));
        panel1.add(btn1);
        panel1.add(btn2);

        Panel panel2 = new Panel(new GridLayout(2, 2));
        panel2.add(btn3);
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);

        frame.add(btn7);
        frame.add(panel1);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(panel2);
        frame.add(btn10);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
