package Lib;

//import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RollingBall extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(100, 90, 100, 100);
       // g.setColor(Color.red);
        g.fillArc(100, 90, 100, 100, 0, 180);
        
        
    }
}
