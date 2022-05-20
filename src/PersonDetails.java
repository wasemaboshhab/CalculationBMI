import javax.swing.*;
import java.awt.*;


public class PersonDetails extends JPanel {

    JLabel firstName = new JLabel("First Name :");
    JTextField userFirstName = new JTextField(8);
    JLabel lastName = new JLabel("Last Name :");
    JTextField userLastName = new JTextField(8);
    JLabel age = new JLabel("Age :");
    JTextField userAge = new JTextField(8);
    Color newColor = new Color(160, 200, 135);

    public PersonDetails() {
        JPanel controls = new JPanel();
        setBackground(newColor);
        setPreferredSize(new Dimension(230, 0));
        BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
        controls.setLayout(layout);
        controls.setBackground(newColor);
        controls.add(Box.createRigidArea(new Dimension(0, 20)));

        controls.add(firstName);
        controls.add(userFirstName);

        controls.add(Box.createRigidArea(new Dimension(0, 30)));

        controls.add(lastName);
        controls.add(userLastName);

        controls.add(Box.createRigidArea(new Dimension(0, 30)));

        controls.add(age);
        controls.add(userAge);

        controls.add(Box.createRigidArea(new Dimension(0, 30)));


        add(controls);

    }

    public JTextField getUserAge() {
        return userAge;
    }

    public JTextField getUserFirstName() {
        return userFirstName;
    }



    public JTextField getUserLastName() {
        return userLastName;
    }




}
