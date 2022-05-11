import javax.swing.*;
import java.awt.*;

public class Main {
    public static final int WINDOW_WIDTH = 600;
    public static final int WINDOW_HEIGHT = 300;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculation of physical condition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT));
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(new MainPanel());
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);



    }
}
