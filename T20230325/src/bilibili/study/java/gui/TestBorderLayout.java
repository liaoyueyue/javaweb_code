package bilibili.study.java.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-25
 * Time: 22:26
 */
public class TestBorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TestBorderLayout");
        frame.setBounds(300, 300, 500, 500);
        frame.setLayout(new BorderLayout());
        JButton east = new JButton("东");
        JButton west = new JButton("西");
        JButton south = new JButton("南");
        JButton north = new JButton("北");
        JButton center = new JButton("中");
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(north, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
