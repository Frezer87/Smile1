import java.awt.Graphics;

import javax.swing.*;

public class Smile extends JApplet {
    public void paint(Graphics convas) {
        convas.drawOval(325, 50, 100, 100);
        convas.drawLine(250, 0, 250, 600);
        convas.drawLine(500, 0, 500, 600);
        convas.drawLine(700, 200, 0, 200);
        convas.drawLine(700, 400, 0, 400);
        convas.drawOval(50, 250, 100, 100);
        convas.drawOval(50, 500, 100, 100);
        convas.drawOval(325, 500, 100, 100);
        convas.drawLine(0, 0, 710, 570);
        convas.drawLine(710, 28, 250, 400);
        convas.drawLine(250, 0, 0, 200);
        convas.drawLine(700, 200, 500, 0);
        convas.drawLine(500, 600, 700, 400);
        convas.drawLine(700, 0, 700, 600);
    }
}
