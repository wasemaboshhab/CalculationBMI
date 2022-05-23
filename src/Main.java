import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static final int WINDOW_WIDTH = 700;
    public static final int WINDOW_HEIGHT = 500;

    public Main(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        setLocationRelativeTo(null);
        getContentPane().add(new MainView());
        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main("Calculation BMI");
    }
}
