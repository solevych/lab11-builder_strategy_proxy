package ucu.edu.ua.task3;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RealImage implements MyImage {
    private JFrame frame;

    public RealImage(String filename) {
        System.out.println("Loading image: " + filename);
        frame = new JFrame();
        ImageIcon icon = new ImageIcon(filename);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    @Override
    public void display() {
        frame.setVisible(true);
    }
}