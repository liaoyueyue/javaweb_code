package bilibili;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-25
 * Time: 17:15
 */
public class TestJavaGUI01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("firstFrame");
        Container pane = frame.getContentPane();
        frame.setSize(400, 400);
        frame.setLocation(200, 200);
        pane.setBackground(Color.PINK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
