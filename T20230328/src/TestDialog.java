import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-28
 * Time: 15:57
 */
public class TestDialog {
    public static void main(String[] args) {
        new MyDialog();
    }
}

class MyDialog extends JDialog {

    JButton button = new JButton("按钮");
    JPanel panel = new JPanel();
    public MyDialog() {
        super((Frame) null, "test", true);
        setBounds(300, 300, 500, 500);

        panel.add(button);
        panel.setVisible(true);

        Container contentPane = getContentPane();
        contentPane.add(panel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了按钮");
            }
        });

        button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("回车热键触发");
            }
        });

        setVisible(true);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    }
}
