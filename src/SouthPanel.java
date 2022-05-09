import javax.swing.*;
import java.awt.*;

public class SouthPanel extends JPanel {
    JButton cancelButton = new JButton("Cancel");
    JButton applyButton = new JButton("Apply");

    public SouthPanel() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(0, 30));

        add(cancelButton);
        add(applyButton);

    }

}
