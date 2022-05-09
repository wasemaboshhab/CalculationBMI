import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel {
    Label header = new Label("Fill Details to calculation physical condition");


    public NorthPanel() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(0, 30));
        header.setFont(new Font("David", Font.BOLD, 18));
        add(header);



    }
}
