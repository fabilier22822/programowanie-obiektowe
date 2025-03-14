package zad6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreeButtonFrame extends JFrame {
    private JLabel label;

    public ThreeButtonFrame() {
        // Ustawienia okna
        setTitle("Three Button Frame");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Kliknij przycisk!");
        add(label);

        JButton closeButton = new JButton("Zamknij");
        JButton titleButton = new JButton("Zmień Tytuł");
        JButton colorButton = new JButton("Zmień Kolor");

        closeButton.addActionListener(e -> System.exit(0));

        titleButton.addActionListener(e -> setTitle("Nowy Tytuł"));

        colorButton.addActionListener(e -> label.setForeground(Color.RED));

        add(closeButton);
        add(titleButton);
        add(colorButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ThreeButtonFrame frame = new ThreeButtonFrame();
            frame.setVisible(true);
        });
    }
}
