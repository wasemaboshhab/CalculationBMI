import javax.swing.*;
import java.awt.*;


public class WestPanel extends JPanel {
    private JTextField userFirstName , userLastName, userAge;


    public WestPanel() {
        setBackground(Model.PANELS_COLOR);
        setPreferredSize(new Dimension(230, 0));

        JLabel firstName = new JLabel("First Name :");
        userFirstName = new JTextField(8);
        JLabel lastName = new JLabel("Last Name :");
        userLastName = new JTextField(8);
        JLabel age = new JLabel("Age :");
        userAge = new JTextField(8);



        JPanel controls = new JPanel();
        BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
        controls.setLayout(layout);
        controls.setBackground(Model.PANELS_COLOR);

        controls.add(Box.createRigidArea(new Dimension(0, 20)));
        controls.add(firstName);
        controls.add(userFirstName);

        controls.add(Box.createRigidArea(new Dimension(0, 30)));
        controls.add(lastName);
        controls.add(userLastName);

        controls.add(Box.createRigidArea(new Dimension(0, 30)));
        controls.add(age);
        controls.add(userAge);


        add(controls);

    }
    public JTextField getUserFirstName() {
        return userFirstName;
    }
    public JTextField getUserLastName() {
        return userLastName;
    }
    public JTextField getUserAge() {
        return userAge;
    }



}
