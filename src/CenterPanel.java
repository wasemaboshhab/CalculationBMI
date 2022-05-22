import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    private ButtonGroup groupGender, groupBodyFrame;
    private JRadioButton small, medium, large;
    private ImageIcon health;

    public CenterPanel() {
        this.setBackground(Model.PANELS_COLOR);
        JLabel gender = new JLabel("Gender");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        groupGender = new ButtonGroup();
        groupGender.add(male);
        groupGender.add(female);

        JLabel bodyFrame = new JLabel("Body Frame: ");
        small = new JRadioButton("Small");
        medium = new JRadioButton("Medium");
        large = new JRadioButton("Large");
        groupBodyFrame = new ButtonGroup();
        groupBodyFrame.add(small);
        groupBodyFrame.add(medium);
        groupBodyFrame.add(large);

        health = Model.HEALTH_IMG;

        JPanel controls = new JPanel();
        BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
        controls.setLayout(layout);
        controls.setBackground(Model.PANELS_COLOR);
        male.setBackground(Model.PANELS_COLOR);
        female.setBackground(Model.PANELS_COLOR);
        small.setBackground(Model.PANELS_COLOR);
        medium.setBackground(Model.PANELS_COLOR);
        large.setBackground(Model.PANELS_COLOR);


        controls.add(Box.createRigidArea(new Dimension(0, 20)));
        controls.add(gender);
        controls.add(male);
        controls.add(female);
        controls.add(Box.createRigidArea(new Dimension(0, 20)));

        controls.add(bodyFrame);
        controls.add(small);
        controls.add(medium);
        controls.add(large);

        add(controls);


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        health.paintIcon(this, g, 0, 210);
    }

    public ButtonGroup getGroupGender() {
        return groupGender;
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


}
