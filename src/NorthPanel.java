import javax.swing.*;

public class NorthPanel extends JPanel {
    public NorthPanel() {
        setBackground(Model.HEADER_PANEL_COLOR);
        JLabel header = new JLabel("Fill Details to calculation physical condition");
        header.setFont(Model.TITLE_FONT);
        add(header);

    }
}
