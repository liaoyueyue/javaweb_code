package bilibili.study.java.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-26
 * Time: 23:36
 */
public class TestJFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("这是一个JFrame框架");

        jFrame.setBounds(300, 300, 500, 500);

        JLabel jLabel = new JLabel("这里是lyy");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jFrame.add(jLabel);

        //Container 容器
        Container container = jFrame.getContentPane();// 获取窗体容器,container(容器)
        container.setBackground(Color.PINK);

        jFrame.setVisible(true);
        /*
         *	窗体的关闭规则
         *	EXIT_ON_CLOSE:隐藏窗口，并停止程序运行
         *	DO_NOTHING_ON_CLOSE:无任何操作
         *	HIDE_ON_CLOSE：隐藏窗口，不停止程序运行
         *	DISPOSE_ON_CLOSE：释放窗口资源
         */
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
