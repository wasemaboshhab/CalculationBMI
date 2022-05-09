import javax.swing.*;
import java.awt.*;
import java.util.ArrayDeque;

public class WestPanel extends JPanel {
    Label firstName = new Label("First Name :");
    JTextField userFirstName = new JTextField(8);
    Label lastName = new Label("Last Name :");
    JTextField userLastName = new JTextField(8);
    Label gender = new Label("Gender");


    public WestPanel() {
        setBackground(Color.GRAY);
        setPreferredSize(new Dimension(200, 0));
        add(firstName);
        add(userFirstName);
        
        add(lastName);
        add(userLastName);

        add(gender);



    }

}
