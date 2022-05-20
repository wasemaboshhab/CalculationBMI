import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HeightAndWight extends JPanel {

    JSlider heightSlider;
    JLabel heightLabel = new JLabel("Height");
    JLabel actualWight = new JLabel("Enter your actual wight :");
    JTextField userActualWight = new JTextField(8);
    JLabel bmiResult = new JLabel();
    JPanel controls = new JPanel();
    Color newColor = new Color(160, 200, 135);
     int height;
    double wightTemp;

    public HeightAndWight() {
        setBackground(newColor);
        setPreferredSize(new Dimension(300, 0));
        BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
        controls.setLayout(layout);
        controls.setBackground(newColor);

        heightSlider = new JSlider(JSlider.HORIZONTAL, 140, 190, 140);
        heightSlider.setMajorTickSpacing(10);
        heightSlider.setMinorTickSpacing(2);
        heightSlider.setPaintTicks(true);
        heightSlider.setPaintLabels(true);
        heightSlider.addChangeListener(e ->{
                    height = heightSlider.getValue();
                    heightLabel.setText("height: " + height + "cm");
                }
                );


        heightLabel = new JLabel("Height: 140 cm");
        heightLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        controls.add(Box.createRigidArea(new Dimension(0, 20)));

        controls.add(heightLabel);
        controls.add(heightSlider);
        controls.add(Box.createRigidArea(new Dimension(0, 40)));

        actualWight = new JLabel("Actual weight: ");
        controls.add(actualWight);
        userActualWight = new JTextField();

        userActualWight.addActionListener(e -> {
                }
                );        controls.add(userActualWight);
        controls.add(Box.createRigidArea(new Dimension(0, 40)));

        this.add(controls);
    }

    public JSlider getHeightSlider() {
        return heightSlider;
    }


    public JTextField getUserActualWight() {
        return userActualWight;
    }



    public JLabel getHeightLabel() {
        return heightLabel;
    }



    @Override
    public int getHeight() {
        return height;
    }

}
