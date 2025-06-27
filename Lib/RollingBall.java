package Lib;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;

public class RollingBall extends JPanel implements ActionListener {

    int x = 10,y=90,start = 0;
    
    public RollingBall(){
        Timer time1 = new Timer(30,this);
        time1.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x, y, 100, 100);
        g.fillArc(x, y, 100, 100, start, 180);
    }

    public void actionPerformed(ActionEvent e) {
        x  -= 5;
        start +=5;
       if (x == -90) {
            x = 300;
        }
        repaint();
        }
}
