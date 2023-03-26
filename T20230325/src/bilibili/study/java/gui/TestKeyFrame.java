package bilibili.study.java.gui;

import javafx.scene.input.KeyCode;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-26
 * Time: 20:45
 */
public class TestKeyFrame {
    public static void main(String[] args) {
        new MyKeyFrame("这里测试方向键");
    }
}

class MyKeyFrame extends Frame {
    public MyKeyFrame(String title) {
        super(title);
        setBounds(300, 300, 500, 500);
        setVisible(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if (keyCode == KeyEvent.VK_UP) {
                    System.out.println("上");
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    System.out.println("下");
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    System.out.println("左");
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    System.out.println("右");
                }

            }
        });
    }
}
