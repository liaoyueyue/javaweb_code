package bilibili.study.java;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-26
 * Time: 19:54
 */
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画圈");
    }
}

class MyFrame extends Frame {
    ArrayList points;

    public MyFrame(String title) {
        super(title);
        setBounds(300, 300, 500, 500);

        points = new ArrayList<>();

        this.addMouseListener(new MyMouseListener());

        setVisible(true);

    }

    public void paint(Graphics g) {
        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            g.setColor(Color.cyan);
            g.fillOval(point.x, point.y, 20, 20);
        }
    }

    //添加一个点到界面
    public void addPaint(Point point) {
        points.add(point);
    }

    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame = (MyFrame) e.getSource();
            myFrame.addPaint(new Point(e.getX(), e.getY()));
            myFrame.repaint();
        }
    }
}


