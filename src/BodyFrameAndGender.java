import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BodyFrameAndGender extends JPanel {
    JPanel controls = new JPanel();
    JLabel gender = new JLabel("Gender");
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    ButtonGroup groupGender = new ButtonGroup();
    JLabel bodyFrame = new JLabel("Body Frame: ");
    JRadioButton small = new JRadioButton("Small");
    JRadioButton medium = new JRadioButton("Medium");
    JRadioButton large = new JRadioButton("Large");
    ButtonGroup group = new ButtonGroup();
    Color newColor = new Color(160, 200, 135);


    public JPanel getControls() {
        return controls;
    }


    public JLabel getBodyFrame() {
        return bodyFrame;
    }

    public JRadioButton getSmall() {
        return small;
    }

    public JRadioButton getMedium() {
        return medium;
    }

    public ButtonGroup getGroup() {
        return groupGender;
    }

    public JRadioButton getLarge() {
        return large;
    }

    public BodyFrameAndGender() {
        this.setBackground(newColor);
        BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
        controls.setLayout(layout);
        controls.setBackground(newColor);
        male.setBackground(newColor);
        female.setBackground(newColor);
        small.setBackground(newColor);
        medium.setBackground(newColor);
        large.setBackground(newColor);
bodyFrame.setBackground(newColor);
        controls.add(Box.createRigidArea(new Dimension(0, 20)));
        controls.add(gender);
        groupGender.add(male);
        groupGender.add(female);

        controls.add(male);
        controls.add(female);
        controls.add(Box.createRigidArea(new Dimension(0, 40)));

        controls.add(bodyFrame);
        group.add(small);
        group.add(medium);
        group.add(large);

        controls.add(small);
        controls.add(medium);
        controls.add(large);

        add(controls);



    }

}
