package zad5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ThreeShapesPanel extends JPanel {  // Needs to be public
    private final Color color1;
    private final Color color2;
    private final Color color3;

    public ThreeShapesPanel() {
        Random rand = new Random();
        color1 = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        color2 = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        color3 = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(color1);
        g.fillRect(30, 30, 100, 80);

        g.setColor(color2);
        g.fillOval(150, 50, 100, 100);

        g.setColor(color3);
        g.fillPolygon(new int[]{300, 250, 350}, new int[]{150, 250, 250}, 3);
    }
}
