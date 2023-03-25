package book.study.java.gui;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-25
 * Time: 17:22
 */
public class Example01 extends JFrame {
    private static void createAndShowGUI() {
        //创建并设置JFrame容器窗口
        JFrame frame = new JFrame("JFrameTest");
        //设置关闭窗口时的默认操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口标题
        frame.setTitle("JFrameTest");
        //设置窗口尺寸
        frame.setSize(350, 300);
        //设置窗口显示位置
        frame.setLocation(300, 200);
        //让组件显示
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Example01::createAndShowGUI);
    }
}
