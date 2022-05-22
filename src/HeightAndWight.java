import javax.swing.*;
import java.awt.*;
public class HeightAndWight extends JPanel {

    private  JSlider heightSlider;
    private  JTextField userActualWight;

    public HeightAndWight() {
        setPreferredSize(new Dimension(300, 0));
        setBackground(Model.PANELS_COLOR);
        userActualWight = new JTextField();
        JLabel heightLabel = new JLabel("Height: 140");
        JLabel actualWight = new JLabel("Enter your actual wight:");

        JPanel controls = new JPanel();
        BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
        controls.setLayout(layout);
        controls.setBackground(Model.PANELS_COLOR);

        heightSlider = new JSlider(JSlider.HORIZONTAL, 140, 190, 140);
        heightSlider.setMajorTickSpacing(10);
        heightSlider.setMinorTickSpacing(2);
        heightSlider.setPaintTicks(true);
        heightSlider.setPaintLabels(true);


        new Controller(heightSlider, heightLabel);


        heightLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        controls.add(Box.createRigidArea(new Dimension(0, 20)));

        controls.add(heightLabel);
        controls.add(heightSlider);
        controls.add(Box.createRigidArea(new Dimension(0, 40)));

        controls.add(actualWight);
        controls.add(userActualWight);
        controls.add(Box.createRigidArea(new Dimension(0, 45)));

        add(controls);
    }

    public JSlider getHeightSlider() {
        return heightSlider;
    }


    public JTextField getUserActualWight() {
        return userActualWight;
    }

}
