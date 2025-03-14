package zad5;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        CloseableFrame frame = new CloseableFrame("Shapes & Controls");
        frame.setLayout(new GridLayout(1, 2));

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(4, 1));
        leftPanel.add(new JButton("Button 1"));
        leftPanel.add(new JButton("Button 2"));
        leftPanel.add(new JLabel("Label Example"));
        leftPanel.add(new JTextField("Text Field"));

        ThreeShapesPanel rightPanel = new ThreeShapesPanel();

        frame.add(leftPanel);
        frame.add(rightPanel);

        frame.setVisible(true);
    }
}
