import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayDeque;

public class WestPanel extends JPanel {
    JLabel personalDetails = new JLabel("Personal Details");
    JLabel firstName = new JLabel("First Name :");
    JTextField userFirstName = new JTextField();
    JLabel lastName = new JLabel("Last Name :");
    JTextField userLastName = new JTextField();
    JLabel age = new JLabel("Age :");
    JTextField userAge = new JTextField();
    JLabel gender = new JLabel("Gender");
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    ButtonGroup group = new ButtonGroup();


    public WestPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));


        setBackground(Color.GRAY);
        male.setBackground(Color.GRAY);
        female.setBackground(Color.GRAY);
        setPreferredSize(new Dimension(200, 0));


        add(personalDetails);

        add(firstName);
        add(userFirstName);

        add(lastName);
        add(userLastName);

        add(age);
        add(userAge);

        group.add(male);
        group.add(female);

        add(gender);
        add(male);
        add(female);


    }

}
