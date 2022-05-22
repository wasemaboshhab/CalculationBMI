import javax.swing.*;
import java.awt.*;



public class SouthPanel extends JPanel {


    private  JButton submitButton;
    private  JButton clearButton;


    public SouthPanel() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(0, 40));
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        clearButton = new JButton("Clear");
        submitButton = new JButton("Submit");

        add(clearButton);
        add(submitButton);
    }

    public JButton getSubmitButton() {
        return submitButton;
    }
    public JButton getClearButton() {
        return clearButton;
    }






}

