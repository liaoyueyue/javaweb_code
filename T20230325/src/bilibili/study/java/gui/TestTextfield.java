package bilibili.study.java.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-26
 * Time: 12:04
 */
public class TestTextfield {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends Frame {
    static TextField textField;
    public MyFrame() {
        setBounds(300, 300, 500, 500);
        setLayout(new GridLayout(2, 1));

        TextField textField = new TextField("这是一个文本框");
        add(textField);
        setMyFrameTextField(textField);

        JButton button = new JButton("清空按钮");
        add(button);

        //监听这个按钮，按下就会触发这个事件
        button.addActionListener(new MyActionListener2());

        //监听这个输入框的文字,按下enter就会触发这个输入框事件
        textField.addActionListener(new MyActionListener());
        //设置替换编码，只要应用在密码上
        textField.setEchoChar('*');

        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



    }

    public void setMyFrameTextField(TextField textField) {
        this.textField = textField;
    }

    public static TextField getMyFrameTextField() {
        return textField;
    }


}

class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField1 = (TextField) e.getSource();
        System.out.println(textField1.getText());   //获得文本框中的文字并输出到控制台

    }
}

class MyActionListener2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = MyFrame.getMyFrameTextField();
        textField.setText("");
    }
}
