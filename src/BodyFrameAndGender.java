import javax.swing.*;
import java.awt.*;

public class BodyFrameAndGender extends JPanel {
//
    JLabel gender = new JLabel("Gender");
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    ButtonGroup groupGender = new ButtonGroup();

    JLabel bodyFrame = new JLabel("Body Frame: ");
    JRadioButton small = new JRadioButton("Small");
    JRadioButton medium = new JRadioButton("Medium");
    JRadioButton large = new JRadioButton("Large");
    ButtonGroup groupBodyFrame = new ButtonGroup();
    Color newColor = new Color(160, 200, 135);

    ImageIcon health;

    public BodyFrameAndGender() {
        JPanel controls = new JPanel();
        health = new ImageIcon("healthy.jfif");
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
        groupBodyFrame.add(small);
        groupBodyFrame.add(medium);
        groupBodyFrame.add(large);

        controls.add(small);
        controls.add(medium);
        controls.add(large);

        add(controls);

    }


//    public JPanel getControls() {
//        return controls;
//    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        health.paintIcon(this, g, 0, 220);
    }

    public JLabel getGender() {
        return gender;
    }

    public JRadioButton getMale() {
        return male;
    }

    public JRadioButton getFemale() {
        return female;
    }

    public ButtonGroup getGroupGender() {
        return groupGender;
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

    public JRadioButton getLarge() {
        return large;
    }

    public ButtonGroup getGroupBodyFrame() {
        return groupBodyFrame;
    }

    public Color getNewColor() {
        return newColor;
    }
}
