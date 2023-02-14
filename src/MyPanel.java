import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image ball;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 3;
    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        ball = new ImageIcon().getImage();
        timer = new Timer(10,this);
        timer.start();
    }

    public void paint(Graphics g) {

        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.green);
        g2D.fillOval(x, y, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=PANEL_WIDTH || x<0) {
            xVelocity *= -1;
        }
        x = x + xVelocity;

        if(y>=PANEL_HEIGHT || y<0) {
            yVelocity *= -1;
        }
        y = y + yVelocity;
        repaint();
    }
}
