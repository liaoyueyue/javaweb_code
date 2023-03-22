import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-17
 * Time: 12:40
 */
public class TestJFrame extends JFrame{
    private static void creareAndShowGUI() {
        //创建并设置Jframe容器窗口
        JFrame frame = new JFrame("JFrameTest");
        //设置关闭窗口时的默认操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口标题
        frame.setTitle("JFrameTest");
        //设置窗口尺寸
        frame.setSize(300, 200);
        //让组件显示
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        //使用SwingUilities工具调用createAndShowGUi()方法显示GUI程序
        SwingUtilities.invokeLater(TestJFrame::creareAndShowGUI);
    }
}
