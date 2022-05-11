import javax.swing.*;
import java.awt.*;

public class EastPanel  extends JPanel {
    JLabel height = new JLabel("Height");
    JSlider userHeight;
    public EastPanel() {
        setBackground(Color.GRAY);
        setPreferredSize(new Dimension(200, 0));
        add(height);
        userHeight = new JSlider(JSlider.HORIZONTAL, 140, 190, 140);
        userHeight.setMajorTickSpacing(10);
        userHeight.setMinorTickSpacing(2);
        userHeight.setPaintTicks(true);
        userHeight.setPaintLabels(true);
        add(userHeight);



    }
}
